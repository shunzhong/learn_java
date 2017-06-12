package com.github.learn.hadoop.hdfs.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Server;


public class MyServer {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		RPC.Builder builder = new RPC.Builder(conf);
		
		builder.setBindAddress("localhost").setPort(1234).setProtocol(Bizable.class).setInstance(new BizablePB());
		Server server = builder.build();
		server.start();
		System.out.println("服务端启动了");
	}
}
