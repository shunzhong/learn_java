package com.github.learn.storm;

import java.util.Map;

import backtype.storm.Config;
import backtype.storm.StormSubmitter;
import backtype.storm.drpc.LinearDRPCTopologyBuilder;
import backtype.storm.generated.AlreadyAliveException;
import backtype.storm.generated.InvalidTopologyException;
import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

public class DrpcTopology {
	public static class MyBolt extends BaseRichBolt{
		
		private OutputCollector collector;
		@Override
		public void prepare(Map stormConf, TopologyContext context,
				OutputCollector collector) {
			this.collector = collector;
		}
		
		/**
		 * 传过来的tuple包含两个参数，第一个是请求的id，第二个是请求的参数
		 */
		@Override
		public void execute(Tuple input) {
			String value = input.getString(1);
			value = "hello "+value;
			this.collector.emit(new Values(input.getValue(0),value));
		}

		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {
			declarer.declare(new Fields("id","value"));
		}
		
	}
	
	
	public static void main(String[] args) {
		LinearDRPCTopologyBuilder topologyBuilder = new LinearDRPCTopologyBuilder("hello");
		topologyBuilder.addBolt(new MyBolt());
		try {
			StormSubmitter.submitTopology(DrpcTopology.class.getSimpleName(), new Config(), topologyBuilder.createRemoteTopology());
		} catch (AlreadyAliveException e) {
			e.printStackTrace();
		} catch (InvalidTopologyException e) {
			e.printStackTrace();
		}
	}

}
