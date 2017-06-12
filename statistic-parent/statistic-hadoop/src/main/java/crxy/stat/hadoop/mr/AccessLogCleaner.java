package crxy.stat.hadoop.mr;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;
import crxy.stat.hadoop.utils.RedisUtils;
import crxy.stat.hadoop.utils.UserAgent;
import crxy.stat.hadoop.utils.UserAgentUtil;

public class AccessLogCleaner {

	//logger打日志
	private static Logger logger=Logger.getLogger(AccessLogCleaner.class);
	
	
	
	public static void main(String[] args) throws Exception {
		
		if(args.length<2){
			logger.error("args need at least 2");
			System.exit(2);
		}
		
		
		Configuration conf=new Configuration();
		Job job=Job.getInstance(conf, "accessLogCleaner");
		
		job.setJarByClass(AccessLogCleaner.class);
		job.setMapperClass(AccessLogCleanerMapper.class);
		job.setMapOutputKeyClass(NullWritable.class);
		job.setMapOutputValueClass(Text.class);
		
		//遍历用户输入的参数作为输入
		for (int i = 0; i < args.length-1; i++) {
			FileInputFormat.addInputPath(job, new Path(args[i]));
		}
		//将用户最后一个参数作为输出参数
		FileOutputFormat.setOutputPath(job, new Path(args[args.length-1]));
		//提交job并等jobok后系统退出
		System.exit(job.waitForCompletion(true)?0:1);
		
		
		
	}
	
	
	//appid	ip	province	city	mid	userid	login_type	request method path http_version 
	//status	http_referer	user_agent ietype	time datetime
	
	public static class AccessLogCleanerMapper extends Mapper<LongWritable, Text, NullWritable, Text>{
		private String line="";
		private String[] strs=null;
		private Integer appId=0;
		private Integer userId=0;
		private Integer loginType=0;
		private Integer status=0;
		private Long time=0l;
		
		private String[] requestStr=null;
		
		private Jedis jedis;
		
		private String ipInfo;
		private String[] ipstrs=null;
		private DateFormat format;
		private Text result=new Text();
		
		@Override
		protected void setup(
				Mapper<LongWritable, Text, NullWritable, Text>.Context context)
				throws IOException, InterruptedException {
			jedis = RedisUtils.getJedis();
			format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		
		@Override
		protected void map(LongWritable key, Text value,
				Mapper<LongWritable, Text, NullWritable, Text>.Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			//appid	ip	mid	userid	login_type	request		status	http_referer	user_agent	time
			if(null!=value&&value.toString().split("\t").length==10){
				line=value.toString();
				strs=line.split("\t");
				
				try {
					appId=Integer.parseInt(strs[0]);
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
				try {
					userId=Integer.parseInt(strs[3]);
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
				try {
					loginType=Integer.parseInt(strs[4]);
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
				try {
					status=Integer.parseInt(strs[6]);
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
				try {
					time=Long.parseLong(strs[9]);
				} catch (Exception e) {
					logger.error(e.getMessage());
				}
				
				
				
				
				AccessLog log=new AccessLog(appId, strs[1], strs[2], userId, loginType, strs[5], status, strs[7], strs[8], time);
				//解析useragent
				UserAgent userAgent = UserAgentUtil.getUserAgent(log.getUserAgent());
				if(null!=userAgent){
					log.setIeType(userAgent.getBrowserType());
				}
				//解析request
				if(null!=log.getRequest()&&log.getRequest().split(" ").length==3){
					requestStr=log.getRequest().split(" ");
					log.setMethod(requestStr[0]);
					log.setPath(requestStr[1]);
					log.setHttpVersion(requestStr[2]);
				}
				//解析ip
				ipInfo=jedis.get("ip:"+log.getIp());
				if(ipInfo!=null&&ipInfo.split("\t").length==2){
					ipstrs=ipInfo.split("\t");
					log.setProvice(ipstrs[0]);
					log.setCity(ipstrs[1]);
				}
				//解析时间
				log.setDateTIme(format.format(new Date(log.getTime())));
				result.set(log.toString());
				context.write(NullWritable.get(), result);
			}
			
			
			
			
			
		}
		
		@Override
		protected void cleanup(
				Mapper<LongWritable, Text, NullWritable, Text>.Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			jedis=null;
			format=null;
		}
		
		
	}
	
	
	
	
}
