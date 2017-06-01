package storm.bbs;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;
/**
 * 对用户的ip进行转换，转换成对应的省份信息，发射出去
 * @author Administrator
 *
 */
public class MyBoltByIp extends BaseRichBolt {
	private OutputCollector collector;
	@Override
	public void prepare(Map stormConf, TopologyContext context,
			OutputCollector collector) {
		this.collector = collector;
	}

	@Override
	public void execute(Tuple input) {
		String ip = input.getStringByField("ip");
		//根据ip获取对应的省份信息，可以本地维护一个ip库，如果本地ip库中没找到，那么就去互联网上找
		String content = PageUtil.getContent("http://int.dpool.sina.com.cn/iplookup/iplookup.php?ip="+ip+"&format=json");
		JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(content);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String city = "";
		try {
			city = jsonObject.getString("city");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.collector.emit(new Values(city));
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("city"));
	}

}
