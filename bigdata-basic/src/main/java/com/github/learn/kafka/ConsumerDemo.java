package com.github.learn.kafka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.github.learn.kafka.consumer.Consumer;
import com.github.learn.kafka.consumer.ConsumerConfig;
import com.github.learn.kafka.consumer.ConsumerIterator;
import com.github.learn.kafka.consumer.KafkaStream;
import com.github.learn.kafka.javaapi.consumer.ConsumerConnector;
import com.github.learn.kafka.message.MessageAndMetadata;

public class ConsumerDemo {
	
	public static void main(String[] args) throws Exception {
		
		Properties prop=new Properties();
		
		//组装消费者的各种属性
		prop.load(ConsumerDemo.class.getClassLoader().getResourceAsStream("consumer.properties"));
		//prop.put(key, value)
		//prop group.id=test-consumer-group-20160410-12
		String topic="world";
		//创建消费者连接
		ConsumerConnector consumerConnector = Consumer.createJavaConsumerConnector(new ConsumerConfig(prop));
		
		Map<String,Integer> topicCountMap=new HashMap<String, Integer>();
		//map指的是：key 对象消费的topic的名称，value 是几个线程去消费。
		topicCountMap.put(topic, 3);
		
		
		//createMessageStreams key 指的是传入的topicCountMap的key 消费者的topic名称。
		//value：是一个list 
		//KafkaStream<byte[], byte[]> 元素：key和value均为byte[]的消息流对象 分别代表消息的key和消费的message
		//list元素个数和topicCountMap 的value数据一致即：几个线程去消费
		Map<String, List<KafkaStream<byte[], byte[]>>> createMessageStreams = consumerConnector.createMessageStreams(topicCountMap);
		List<KafkaStream<byte[], byte[]>> list = createMessageStreams.get(topic);
		
		
		for (KafkaStream<byte[], byte[]> kafkaStream : list) {
			//多线程类启动
			new Thread(new ConsumerData(kafkaStream)).start();
		}
		
	}
	
	//多线程消费类
	static class ConsumerData implements Runnable{

		private KafkaStream<byte[], byte[]> kafkaStream;
		
		
		public ConsumerData(KafkaStream<byte[], byte[]> _kafkaStream) {
			// TODO Auto-generated constructor stub
			this.kafkaStream=_kafkaStream;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			ConsumerIterator<byte[], byte[]> iterator = kafkaStream.iterator();
			//不写多线程类此处会阻塞
			while(iterator.hasNext()){
				MessageAndMetadata<byte[], byte[]> next = iterator.next();
				System.out.println(String.format("key :%s, message:%s ,offset:%s ,partition:%s",
						next.key()==null?null:new String(next.key()),
								new String(next.message()),next.offset(),next.partition()
						));
				
			}
			
		}
		
		
		
	}

}
