package hdfs.rpc;

import java.io.IOException;

import org.apache.hadoop.ipc.ProtocolSignature;

public class BizablePB implements Bizable {

	public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
		return versionID;
	}

	public ProtocolSignature getProtocolSignature(String protocol, long clientVersion, int clientMethodsHash)
			throws IOException {
		return new ProtocolSignature();
	}

	public String hello(String name) {
		System.out.println("我被调用了");
		return "hello "+name;
	}
	
	public String heartbeat(String status) {
		return "我处理了状态"+status;
	}

}
