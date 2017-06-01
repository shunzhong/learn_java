package hbase;

import java.util.List;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HRegionLocation;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.RegionLocator;

/**
 * 在hbase0.98.8版本中，通过调用table.getRegionLocations()获取region信息；
 * 在hbase1.1.5版本中，通过单独的RegionLocator类获取region信息。
 * @author 吴超
 *
 */
public class RegionOperationExample {
	public static void main(String[] args) throws Exception{
		Connection connection = ConnectionFactory.createConnection(HBaseConfiguration.create());
		
		RegionLocator regionLocator = connection.getRegionLocator(TableName.valueOf("t1"));
		
		List<HRegionLocation> allRegionLocations = regionLocator.getAllRegionLocations();
		for (HRegionLocation hRegionLocation : allRegionLocations) {
			System.out.println(hRegionLocation);
		}
		connection.close();
	}
}
