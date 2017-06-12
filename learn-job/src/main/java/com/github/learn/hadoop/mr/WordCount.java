package com.github.learn.hadoop.mr;


import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Counter;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordCount {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "WordCount");
		job.setJarByClass(WordCount.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setMapperClass(WordMapper.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		job.setReducerClass(WordReducer.class);
		job.waitForCompletion(true);	
		
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
	}

}


class WordMapper extends Mapper<IntWritable, Text, Text, IntWritable> {
	@Override
	protected void map (IntWritable key, Text value, Mapper<IntWritable, Text, Text, IntWritable>.Context context) 
			throws IOException, InterruptedException {
		String line = value.toString();
		
		Counter  counter = context.getCounter("Counter_Buss", "count_hello");
		if(line.contains("hello")) {
			counter.increment(1L);
		}
		String[] splited = line.split(" ");
		
		for (String word : splited) {
			Text k2 = new Text(word);
			IntWritable v2 = new IntWritable(1);
			context.write(k2, v2);
		}
	}
	
}


class WordReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	
	protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context
            ) throws IOException, InterruptedException {
		int count = 0;
		for (IntWritable times : values) {
			count += times.get();
		}
		IntWritable v3 = new IntWritable(count);
		context.write(key, v3);
	}
}