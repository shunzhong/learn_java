package mr;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.ArrayWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class TrafficApp3 {

	public static void main(String[] args) throws Exception{
		Job job = Job.getInstance(new Configuration(), TrafficApp3.class.getSimpleName());
		job.setJarByClass(TrafficApp3.class);
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
		job.setOutputValueClass(NullWritable.class);
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
	
	
	public static class TrafficReducer extends Reducer<Text, TrafficWritable, Text, NullWritable>{
		Text k3 = new Text();
		//k2表示手机号
		//v2s表示不同行中的流量集合
		@Override
		protected void reduce(Text k2, Iterable<TrafficWritable> v2s,
				Reducer<Text, TrafficWritable, Text, NullWritable>.Context context)
						throws IOException, InterruptedException {
			long upPackNum = 0L;
			long downPackNum = 0L;
			long upPayLoad = 0L;
			long downPayLoad = 0L;
			for (TrafficWritable v2 : v2s) {
				Writable[] values = v2.get();
				upPackNum += ((LongWritable)values[0]).get();
				downPackNum += ((LongWritable)values[1]).get();
				upPayLoad += ((LongWritable)values[2]).get();
				downPayLoad += ((LongWritable)values[3]).get();
			}
			k3.set(k2.toString()+"\t"+upPackNum+"\t"+downPackNum+"\t"+upPayLoad+"\t"+downPayLoad);
			context.write(k3, NullWritable.get());
		}
	}
	

	
	public static class TrafficWritable extends ArrayWritable{

		public TrafficWritable() {
			super(LongWritable.class);
		}
		
		public void set(long upPackNum, long downPackNum, long upPayLoad, long downPayLoad){
			Writable[] values = new Writable[4];
			values[0] = new LongWritable(upPackNum);
			values[1] = new LongWritable(downPackNum);
			values[2] = new LongWritable(upPayLoad);
			values[3] = new LongWritable(downPayLoad);
			super.set(values);
		}
		
		public void set(String upPackNum, String downPackNum, String upPayLoad, String downPayLoad){
			this.set(Long.parseLong(upPackNum), Long.parseLong(downPackNum), Long.parseLong(upPayLoad), Long.parseLong(downPayLoad));
		}
		
		@Override
		public String toString() {
			String[] strings = super.toStrings();
			return StringUtils.join(strings, "\t");
		}
	}
}
