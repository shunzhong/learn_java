package kafka;

import kafka.producer.Partitioner;

public class PartitionerDemo implements Partitioner {

	public PartitionerDemo(kafka.utils.VerifiableProperties properties) {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public int partition(Object key, int numPartitions) {
	
		String str=(String) key;
		
		if(str=="k1"){
			return 0;
		}
		if(str=="k2"){
			return 1;
		}
		if(str=="k3"){
			return 2;
		}
		return 3;
	}

}
