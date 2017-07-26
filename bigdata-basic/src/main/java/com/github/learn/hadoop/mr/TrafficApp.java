package com.github.learn.hadoop.mr;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class TrafficApp {

	public static void main(String[] args) throws Exception{
		Job job = Job.getInstance(new Configuration(), TrafficApp.class.getSimpleName());
		job.setJarByClass(TrafficApp.class);
		//set input paths
		FileInputFormat.setInputPaths(job, args[0]);
		//set mapper class
		job.setMapperClass(TrafficMapper.class);
		//set map output key and value style
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(TrafficWritable.class);
		//set reducer class
		job.setReducerClass(TrafficReducer.class);
		//set reduce output key and value style
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(TrafficWritable.class);
		//set output paths
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
	
		//submit job
		job.waitForCompletion(true);
	}
	
	public static class TrafficMapper extends Mapper<LongWritable, Text, Text, TrafficWritable>{
		Text k2 = new Text();
		TrafficWritable v2 = new TrafficWritable();
		@Override
		protected void map(LongWritable key, Text value,
				Mapper<LongWritable, Text, Text, TrafficWritable>.Context context)
						throws IOException, InterruptedException {
			String line = value.toString();
			String[] splited = line.split("\t");

			k2.set(splited[1]);
			v2.set(splited[6], splited[7], splited[8], splited[9]);
			context.write(k2, v2);
		}
	}
	
	
	public static class TrafficReducer extends Reducer<Text, TrafficWritable, Text, TrafficWritable>{
		TrafficWritable v3 = new TrafficWritable();
		//k2表示手机号
		//v2s表示不同行中的流量集合
		@Override
		protected void reduce(Text k2, Iterable<TrafficWritable> v2s,
				Reducer<Text, TrafficWritable, Text, TrafficWritable>.Context context)
						throws IOException, InterruptedException {
			long upPackNum = 0L;
			long downPackNum = 0L;
			long upPayLoad = 0L;
			long downPayLoad = 0L;
			for (TrafficWritable v2 : v2s) {
				upPackNum += v2.getUpPackNum();
				downPackNum += v2.getDownPackNum();
				upPayLoad += v2.getUpPayLoad();
				downPayLoad += v2.getDownPayLoad();
			}
			
			v3.set(upPackNum, downPackNum, upPayLoad, downPayLoad);
			context.write(k2, v3);
		}
	}
	

	
	public static class TrafficWritable implements Writable{
		private long upPackNum;
		private long downPackNum;
		private long upPayLoad;
		private long downPayLoad;
		
		//必须有无参构造方法
		public TrafficWritable(){}

		public void set(long upPackNum, long downPackNum, long upPayLoad, long downPayLoad) {
			this.upPackNum = upPackNum;
			this.downPackNum = downPackNum;
			this.upPayLoad = upPayLoad;
			this.downPayLoad = downPayLoad;
		}
		
		public void set(String upPackNum, String downPackNum, String upPayLoad, String downPayLoad){
			this.set(Long.parseLong(upPackNum), Long.parseLong(downPackNum), Long.parseLong(upPayLoad), Long.parseLong(downPayLoad));
		}

		public void write(DataOutput out) throws IOException {
			out.writeLong(this.upPackNum);
			out.writeLong(this.downPackNum);
			out.writeLong(this.upPayLoad);
			out.writeLong(this.downPayLoad);
		}

		public void readFields(DataInput in) throws IOException {
			this.upPackNum = in.readLong();
			this.downPackNum = in.readLong();
			this.upPayLoad = in.readLong();
			this.downPayLoad = in.readLong();
		}

		public long getUpPackNum() {
			return upPackNum;
		}

		public long getDownPackNum() {
			return downPackNum;
		}

		public long getUpPayLoad() {
			return upPayLoad;
		}

		public long getDownPayLoad() {
			return downPayLoad;
		}
		
		@Override
		public String toString() {
			return this.upPackNum+"\t"+this.downPackNum+"\t"+this.upPayLoad+"\t"+this.downPayLoad;
		}
	}
}
