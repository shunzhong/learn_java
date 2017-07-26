package com.github.learn.storm;

import org.apache.thrift7.TException;

import backtype.storm.generated.DRPCExecutionException;
import backtype.storm.utils.DRPCClient;

public class DrpcClient {
	
	public static void main(String[] args) {
		//创建一个drpc客户端连接到drpc服务端
		DRPCClient drpcClient = new DRPCClient("192.168.1.171", 3772);
		String result;
		try {
			//执行hello功能，传递的参数是storml
			result = drpcClient.execute("hello", "jsdhasjkhdkh");
			System.out.println(result);
		} catch (TException e) {
			e.printStackTrace();
		} catch (DRPCExecutionException e) {
			e.printStackTrace();
		}
	}

}
