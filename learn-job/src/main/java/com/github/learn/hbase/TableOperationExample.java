package com.github.learn.hbase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * 对表记录的操作，在hbase1.xxx中使用Table，在hbase0.98.8中，使用HTable
 * 
 * 使用Table可以get, put, delete or scan 数据，只能作用在一张表。
 * 在这里，执行一次get、put、delete、scan就会与region server建立rpc通讯。这里的rpc通讯特别消耗时间。
 * 所以，在操作table时，尽量减少rpc建立的次数，使用批量传输的方式。
 * @author 吴超
 *
 */
public class TableOperationExample {
	public static void main(String[] args) throws Exception {
		Connection connection = ConnectionFactory.createConnection(HBaseConfiguration.create());
		
		Table table = connection.getTable(TableName.valueOf("t1"));
		//putBatchData(table, 40000);
		//getData(table);
		//scanData(table);
		countData(table);
		
		
		table.close();
		
		connection.close();
	}

	public static void countData(Table table) throws IOException {
		long start = System.currentTimeMillis();
		Scan scan = new Scan();
		ResultScanner scanner = table.getScanner(scan);
		int i=0;
		for (Result result : scanner) {
			i++;
		}
		long stop = System.currentTimeMillis();
		System.out.println("计数"+i+"\t计数花费"+(stop-start)/1000+"秒");
	}

	public static void scanData(Table table) throws IOException {
		Scan scan = new Scan();
		ResultScanner scanner = table.getScanner(scan);
		for (Result result : scanner) {
			printResult(result);
		}
	}

	public static void getData(Table table) throws IOException {
		Get get = new Get(Bytes.toBytes("r1"));
		get.addFamily(Bytes.toBytes("f1"));
		Result result = table.get(get);
		printResult(result);
	}

	public static void printResult(Result result) {
		byte[] rowKey = result.getRow();
		//Map<family,Map<qualifier,Map<timestamp,value>>> 
		NavigableMap<byte[], NavigableMap<byte[], NavigableMap<Long, byte[]>>> map1 = result.getMap();
		for(Map.Entry<byte[], NavigableMap<byte[], NavigableMap<Long, byte[]>>> entry1 : map1.entrySet()){
			//k1表示列族名称
			byte[] k1 = entry1.getKey();
			NavigableMap<byte[], NavigableMap<Long, byte[]>> map2 = entry1.getValue();
			for(Map.Entry<byte[], NavigableMap<Long, byte[]>> entry2 : map2.entrySet()){
				//表示限定符名称
				byte[] k2 = entry2.getKey();
				NavigableMap<Long, byte[]> map3 = entry2.getValue();
				for(Map.Entry<Long, byte[]> entry3 : map3.entrySet()){
					//表示时间戳
					Long k3 = entry3.getKey();
					//表示真正的值
					byte[] value = entry3.getValue();
					
					System.out.println("行键"+Bytes.toString(rowKey)+"\t列"+Bytes.toString(k1)+":"+Bytes.toString(k2)+"\t时间戳"+k3+"\t值"+Bytes.toString(value));
				}
			}
		}
	}
	/**
	 * 单个插入，TPS=333
	 * @param table
	 * @param max
	 * @throws IOException
	 */
	public static void putData(Table table, int max) throws IOException {
		long start = System.currentTimeMillis();
		for(int i=0; i<max; i++){
			byte[] rowKey = Bytes.toBytes(i);
			Put put = new Put(rowKey);
			byte[] family = Bytes.toBytes("f1");
			byte[] qualifier = Bytes.toBytes("c1");
			long ts = 1L;
			byte[] value = Bytes.toBytes(i); 

			put.addColumn(family , qualifier, ts , value);
			table.put(put);
		}
		long stop = System.currentTimeMillis();
		System.out.println("插入花费"+(stop-start)/1000+"秒");
	}
	
	/**
	 * 批量插入，TPS=40000
	 * @param table
	 * @param max
	 * @throws IOException
	 */
	public static void putBatchData(Table table, int max) throws IOException {
		long start = System.currentTimeMillis();
		List<Put> putList = new ArrayList<Put>();
		for(int i=0; i<max; i++){
			byte[] rowKey = Bytes.toBytes(i);
			Put put = new Put(rowKey);
			byte[] family = Bytes.toBytes("f1");
			byte[] qualifier = Bytes.toBytes("c1");
			long ts = 1L;
			byte[] value = Bytes.toBytes(i); 

			put.addColumn(family , qualifier, ts , value);
			putList.add(put);
		}
		table.put(putList);
		long stop = System.currentTimeMillis();
		System.out.println("插入花费"+(stop-start)/1000+"秒");
	}
}
