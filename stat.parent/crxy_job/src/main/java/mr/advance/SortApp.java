package mr.advance;

import java.io.DataInput;

import java.io.DataOutput;

import java.io.IOException;

import java.net.URI;

import mr.WordCountApp;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.fs.FSDataInputStream;

import org.apache.hadoop.fs.FileSystem;

import org.apache.hadoop.fs.Path;

import org.apache.hadoop.io.IOUtils;

import org.apache.hadoop.io.IntWritable;

import org.apache.hadoop.io.LongWritable;

import org.apache.hadoop.io.Text;

import org.apache.hadoop.io.WritableComparable;

import org.apache.hadoop.mapreduce.Job;

import org.apache.hadoop.mapreduce.Mapper;

import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;

import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

/**
1.在map和reduce阶段进行排序时，比较的是k2。v2是不参与排序比较的。如果要想让v2也进行排序，需要把k2和v2组装成新的类，作为k2，才能参与比较。
2.分组时也是按照k2进行比较的。
如下内容 按照第一列升序排列，当第一列相同时，第二列升序排列

3    3
3    1
3    2
2    1
2    2
1    1

-----------------

结果如下
1    1
2    1
2    2
3    1
3    2
3    3

 * 二次排序Secondary Sort

 * @author wuchao

 *

 */

public class SortApp {

	public static final String INPUT_PATH = "hdfs://hadoop:9000/data";
	public static final String OUT_PATH = "hdfs://hadoop:9000/out";
	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();
		final FileSystem fileSystem = FileSystem.get(new URI(INPUT_PATH), conf);
		fileSystem.delete(new Path(OUT_PATH), true);

		final Job job = Job.getInstance(conf, WordCountApp.class.getSimpleName());
		job.setJarByClass(SortApp.class);

		FileInputFormat.setInputPaths(job, INPUT_PATH);
		job.setInputFormatClass(TextInputFormat.class);
		job.setMapperClass(MyMapper.class);
		job.setMapOutputKeyClass(TwoInt.class);
		job.setMapOutputValueClass(IntWritable.class);

		job.setReducerClass(MyReducer.class);
		job.setOutputKeyClass(IntWritable.class);
		job.setOutputValueClass(IntWritable.class);
		FileOutputFormat.setOutputPath(job, new Path(OUT_PATH));
		job.setOutputFormatClass(TextOutputFormat.class);

		// 把代码提交给JobTracker执行
		job.waitForCompletion(true);
		final FSDataInputStream in = fileSystem.open(new Path(OUT_PATH + "/part-r-00000"));
		IOUtils.copyBytes(in, System.out, 1024, true);

	}

	public static class MyMapper extends Mapper<LongWritable, Text, TwoInt, IntWritable> {
		final TwoInt k2 = new TwoInt();
		final IntWritable v2 = new IntWritable();
		protected void map(LongWritable key, Text value,
				org.apache.hadoop.mapreduce.Mapper<LongWritable, Text, TwoInt, IntWritable>.Context context)
				throws java.io.IOException, InterruptedException {
			final String[] splited = value.toString().split("\t");
			k2.set(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]));
			v2.set(Integer.parseInt(splited[1]));
			context.write(k2, v2);
		};
	}

	// 排序后，会产生6个组
	public static class MyReducer extends Reducer<TwoInt, IntWritable, IntWritable, IntWritable> {
		final IntWritable k3 = new IntWritable();
		protected void reduce(TwoInt key2, java.lang.Iterable<IntWritable> value2s,
				org.apache.hadoop.mapreduce.Reducer<TwoInt, IntWritable, IntWritable, IntWritable>.Context context)
				throws java.io.IOException, InterruptedException {
			k3.set(key2.first);
			for (IntWritable value2 : value2s) {
				context.write(k3, value2);
			}
		};
	}
}

class TwoInt implements WritableComparable<TwoInt> {
	
	int first;
	int second;

	public void set(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		out.writeInt(this.first);
		out.writeInt(this.second);
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		this.first = in.readInt();
		this.second = in.readInt();
	}

	/**
	 * 
	 * 先比较first，如果first相同，再比较second
	 * 
	 * @param o
	 * 
	 * @return
	 * 
	 */

	@Override
	public int compareTo(TwoInt o) {
		if (this.first != o.first) {
			return this.first - o.first;
		} else {
			return this.second - o.second;
		}
	}
}
