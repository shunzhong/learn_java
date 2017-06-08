package storm;

import java.util.Map;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.StormSubmitter;
import backtype.storm.generated.AlreadyAliveException;
import backtype.storm.generated.InvalidTopologyException;
import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

public class StormTopologyFieldGrouping {
	/**
	 * spout需要继承baserichspout
	 * @author Administrator
	 *
	 */
	public static class MySpout extends BaseRichSpout{
		
		
		
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
			System.err.println("open方法执行了。。。。。");
			this.conf = conf;
			this.context = context;
			this.collector = collector;
		}

		/**
		 * 这个方法是一个死循环，会一直不停的被调用
		 */
		int i=1;
		@Override
		public void nextTuple() {
			System.err.println("nextTuple方法执行了。。。。。");
			this.collector.emit(new Values(i++,i%2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * 声明输出字段，也就是给发送出去的数据对应的起个名字
		 */
		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			System.err.println("declareOutputFields方法执行了。。。。。");
			declarer.declare(new Fields("num","flag"));
		}
		
	}
	
	
	
	public static class MyBolt extends BaseRichBolt{

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
		int sum = 0;
		@Override
		public void execute(Tuple input) {
			//Integer integer = input.getInteger(0);
			Integer value = input.getIntegerByField("num");
			//sum+=value;
			System.out.println("线程id："+Thread.currentThread().getId()+",value = "+value);
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
		topologyBuilder.setSpout("a", new MySpout());//提高线程数量("a", new MySpout(),2)
		//指定让mybolt接收myspout的输出，通过shuffergrouping
		topologyBuilder.setBolt("b", new MyBolt(),3).fieldsGrouping("a", new Fields("flag"));
		
		/*//创建一个本地集群来运行topology任务
		LocalCluster localCluster = new LocalCluster();
		//把topology提交到集群中运行
		localCluster.submitTopology("localTopology", new Config(), topologyBuilder.createTopology());*/
		//把topology提交到storm集群上运行
		try {
			Config stormConf = new Config();
			StormSubmitter.submitTopology("StormTopology", stormConf, topologyBuilder.createTopology());
		} catch (AlreadyAliveException e) {
			e.printStackTrace();
		} catch (InvalidTopologyException e) {
			e.printStackTrace();
		}
		
	}

}
