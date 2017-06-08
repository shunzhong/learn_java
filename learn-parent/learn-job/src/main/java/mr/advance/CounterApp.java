package mr.advance;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Counter;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class CounterApp {
	public static class MyMapper extends Mapper<LongWritable, Text, Text, LongWritable>{
		@Override
		protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, LongWritable>.Context context)
				throws IOException, InterruptedException {
			String line = value.toString();
			System.out.println(String.format("mapper输入的<k1,v1>=<%d,%s>", key.get(), line));
			
			
			Counter counterForHello = context.getCounter("Sensitive Words", "hello");
			if(line.contains("hello")){
				counterForHello.increment(1L);
			}
			
			String[] splited = line.split(" ");
			for (String word : splited) {
				Text k2 = new Text(word);
				LongWritable v2 = new LongWritable(1);
				System.out.println(String.format("mapper输出的<k2,v2>=<%s,%d>", word, 1));
				context.write(k2, v2);
				
			}
		}
	}
	
	public static class MyReducer extends Reducer<Text, LongWritable, Text, LongWritable>{
		@Override
		protected void reduce(Text k2, Iterable<LongWritable> v2s,
				Reducer<Text, LongWritable, Text, LongWritable>.Context context) throws IOException, InterruptedException {
			long count = 0L;
			for (LongWritable times : v2s) {
				long l = times.get();
				count += l;
				System.out.println(String.format("reducer输入的<k2,v2>=<%s,%d>", k2.toString(), l));
			}

			LongWritable v3 = new LongWritable(count);
			System.out.println(String.format("reducer输出的<k3,v3>=<%s,%d>", k2.toString(), count));
			context.write(k2, v3);
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf , CounterApp.class.getSimpleName());
		//必须指定
		job.setJarByClass(CounterApp.class);
		
		//数据来自哪里
		FileInputFormat.setInputPaths(job, args[0]);
		//自定义的mapper在哪里
		job.setMapperClass(MyMapper.class);
		//指定mapper输出的<k2,v2>的类型
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(LongWritable.class);
		
		
		//自定义的reducer在哪里
		job.setReducerClass(MyReducer.class);
		//指定reducer输出的<k3,v3>的类型
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(LongWritable.class);
		//数据写到哪里
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		job.waitForCompletion(true);
	}
}
