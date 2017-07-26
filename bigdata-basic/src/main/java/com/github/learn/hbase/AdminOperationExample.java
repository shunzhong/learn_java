package com.github.learn.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

/**
 * 在0.98.8版本，使用HBaseAdmin；在1.xx之后的版本，统一使用Admin
 * 
 * 
 * Admin可以create, drop, list, enable and disable 表, add and drop 列族
 * @author 吴超
 *
 */
public class AdminOperationExample {
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		//在1.xxx版本中，需要程序员手工获得Connection对象，并且一定要在最后关闭connection对象。
		Connection connection = ConnectionFactory.createConnection(conf);
		
		Admin admin = connection.getAdmin();
		//在1.xxx版本中，表名称只能使用TableName类型
		TableName tableName = TableName.valueOf("t3");
		HTableDescriptor desc = new HTableDescriptor(tableName);
		HColumnDescriptor family = new HColumnDescriptor("f1");
		desc.addFamily(family);
		admin.createTable(desc);
		admin.close();
		
		//程序员一定要关闭
		connection.close();
	}
}
