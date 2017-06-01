package hdfs.rpc;

import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class MyClient {
	public static void main(String[] args) throws Exception {
		InetSocketAddress addr = new InetSocketAddress("localhost", 1234);
		Configuration conf = new Configuration();
		Bizable protocolProxy = (Bizable) RPC.getProxy(Bizable.class, Bizable.versionID, addr , conf );
		
		while(true){
			String result = protocolProxy.heartbeat(System.currentTimeMillis()+"");
			System.out.println("客户端"+result);
			Thread.sleep(3000);
		}
		
	}
}
