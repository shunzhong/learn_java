package storm.bbs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

/**
 * 数据源---获取用户访问日志
 * @author Administrator
 *
 */
public class MyDataSpout extends BaseRichSpout{
	
	private SpoutOutputCollector collector;
	private BufferedReader bufferedReader;
	/**
	 * 初始化的动作
	 */
	@Override
	public void open(Map conf, TopologyContext context,
			SpoutOutputCollector collector) {
		this.collector = collector;
		try {
			bufferedReader = new BufferedReader(new FileReader(new File("d:\\access_2013_05_30.log")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void nextTuple() {
		String line = null;
		try {
			if((line=bufferedReader.readLine())!=null){
				String[] words = line.split(" ");
				//把ip解析并发送出去
				this.collector.emit(new Values(words[0]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("ip"));
	}
	
}