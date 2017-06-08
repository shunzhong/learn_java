package storm;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.BoltDeclarer;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

public class WordCountStormTopology2 {
	/**
	 * spout需要继承baserichspout
	 * @author Administrator
	 *
	 */
	public static class DataSourceSpout extends BaseRichSpout{
		
		
		
		private Map conf;
		private TopologyContext context;
		private SpoutOutputCollector collector;
		/**
		 * 是一个初始化方法，只会被执行一次，在这里面可以做一些初始化的操作
		 * Map conf：配置类，topology的配置信息
		 * TopologyContext context：topology上下文 
		 * SpoutOutputCollector collector：发射器，负责向外发射数据
		 */
		@Override
		public void open(Map conf, TopologyContext context,
				SpoutOutputCollector collector) {
			this.conf = conf;
			this.context = context;
			this.collector = collector;
		}

		/**
		 * 这个方法是一个死循环，会一直不停的被调用
		 */
		@Override
		public void nextTuple() {
			//需要监控指定目录下面文件的变化，发现有新文件的话就读取过来，
			Collection<File> listFiles = FileUtils.listFiles(new File("d:\\test"), new String[]{"txt"}, true);
			for (File file : listFiles) {
				List<String> readLines;
				try {
					readLines = FileUtils.readLines(file);
					//获取文件的每一行数据，然后把每一行数据发射出去
					for (String line : readLines) {
						this.collector.emit(new Values(line));
					}
					FileUtils.moveFile(file, new File(file.getAbsolutePath()+System.currentTimeMillis()));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		/**
		 * 声明输出字段，也就是给发送出去的数据对应的起个名字
		 */
		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			declarer.declare(new Fields("line"));
		}
		
	}
	
	
	
	public static class SplitBolt extends BaseRichBolt{

		private Map stormConf;
		private TopologyContext context;
		private OutputCollector collector;
		/**
		 * 初始化方法
		 */
		@Override
		public void prepare(Map stormConf, TopologyContext context,
				OutputCollector collector) {
			this.stormConf = stormConf;
			this.context = context;
			this.collector = collector;
		}
		
		/**
		 * 会被循环调用，只要spout发射一个tuple，这边就会被调用一次
		 */
		@Override
		public void execute(Tuple input) {
			//从tuple中获取spout发射出来的数据
			String line = input.getStringByField("line");
			//对每一行数据进行切割
			String[] words = line.split("\t");
			//把切割出来的单词一个个发射出去
			for (String word : words) {
				this.collector.emit(new Values(word));
			}
		}

		/**
		 * 如果spout中的nexttuple或者bolt中的execute中执行了emit发射功能的话，才需要在这里声明输出字段
		 */
		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			declarer.declare(new Fields("word"));
		}
		
	}
	
	
	
	public static class CountBolt extends BaseRichBolt{

		private Map stormConf;
		private TopologyContext context;
		private OutputCollector collector;
		/**
		 * 初始化方法
		 */
		@Override
		public void prepare(Map stormConf, TopologyContext context,
				OutputCollector collector) {
			this.stormConf = stormConf;
			this.context = context;
			this.collector = collector;
		}
		
		/**
		 * 会被循环调用，只要spout发射一个tuple，这边就会被调用一次
		 */
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		@Override
		public void execute(Tuple input) {
			//从tuple中获取spout发射出来的单词
			String word = input.getStringByField("word");
			//把单词存储到map中进行汇总求和
			Integer value = hashMap.get(word);
			if(value==null){
				value=0;
			}
			value++;
			hashMap.put(word, value);
			
			this.collector.emit(new Values(word,value));
		}

		/**
		 * 如果spout中的nexttuple或者bolt中的execute中执行了emit发射功能的话，才需要在这里声明输出字段
		 */
		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			declarer.declare(new Fields("word","count"));
		}
		
	}
	
	/**
	 * 全局汇总bolt
	 * @author Administrator
	 *
	 */
	public static class AllCountBolt extends BaseRichBolt{

		private Map stormConf;
		private TopologyContext context;
		private OutputCollector collector;
		/**
		 * 初始化方法
		 */
		@Override
		public void prepare(Map stormConf, TopologyContext context,
				OutputCollector collector) {
			this.stormConf = stormConf;
			this.context = context;
			this.collector = collector;
		}
		
		/**
		 * 会被循环调用，只要spout发射一个tuple，这边就会被调用一次
		 */
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		@Override
		public void execute(Tuple input) {
			String word = input.getStringByField("word");
			Integer count = input.getIntegerByField("count");
			hashMap.put(word, count);
			//所有单词出现的总次数
			int word_sum = 0;
			Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				word_sum+=entry.getValue();
			}
			System.out.println("所有单词出现的总次数："+word_sum);
			System.out.println("去重之后单词的个数："+hashMap.size());
		}

		/**
		 * 如果spout中的nexttuple或者bolt中的execute中执行了emit发射功能的话，才需要在这里声明输出字段
		 */
		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			
		}
		
	}
	
	
	
	
	
	
	/**
	 * 组装topology，并且运行
	 * @param args
	 */
	public static void main(String[] args) {
		TopologyBuilder topologyBuilder = new TopologyBuilder();
		topologyBuilder.setSpout("a", new DataSourceSpout());
		//指定让mybolt接收myspout的输出，通过shuffergrouping
		topologyBuilder.setBolt("b", new SplitBolt()).shuffleGrouping("a");
		/**
		 * 局部汇总
		 * Bolt的第一个线程
			a=2
			b=2
		   Bolt的第二个线程
		   	c=2
		 */
		topologyBuilder.setBolt("c", new CountBolt(),2).fieldsGrouping("b", new Fields("word"));
		topologyBuilder.setBolt("d", new AllCountBolt()).shuffleGrouping("c");
		
		//创建一个本地集群来运行topology任务
		LocalCluster localCluster = new LocalCluster();
		//把topology提交到集群中运行
		localCluster.submitTopology("localTopology", new Config(), topologyBuilder.createTopology());
	}

}
