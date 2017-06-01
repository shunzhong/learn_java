package hdfs.rpc;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface Bizable extends VersionedProtocol{
	public static long versionID = 2345245;
	
	public String hello(String name);
	
	public String heartbeat(String status);
}
