package kafka;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class ProducerDemo {

	public static void main(String[] args) throws Exception {
		
		//broker-list
		Properties prop=new Properties();
		//prop.put("metadata.broker.list", "crxy155.crxy:9092,crxy156.crxy:9092,crxy162.crxy:9092");
		//broker-list
		//组装生产者的各种属性
		prop.load(ProducerDemo.class.getClassLoader().getResourceAsStream("producer.properties"));
		
		String topic="world";
		//System.out.println(prop.get("metadata.broker.list"));
		//创建生产者对象
		Producer<String, String> producer=new Producer<String, String>(new ProducerConfig(prop));
		
		
		//初始化消息 key 和 value 可以自定义  现在为 String, String
		KeyedMessage<String, String> message1=new KeyedMessage<String, String>(topic, "k1", "msg1");
		//KeyedMessage<String, String> message11=new KeyedMessage<String, String>(topic,  "msg1");
		KeyedMessage<String, String> message2=new KeyedMessage<String, String>(topic, "k2", "msg2");
		KeyedMessage<String, String> message3=new KeyedMessage<String, String>(topic, "k3", "msg3");
		//发送单个的消息
		producer.send(message1);
		
		List<KeyedMessage<String, String>> list=new ArrayList<KeyedMessage<String,String>>();
		list.add(message2);
		list.add(message3);
		//批量发送消息
		producer.send(list);
		
		//关闭连接
		producer.close();
		
	}
	
	
	
}
