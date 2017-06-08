package mr.advance;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
/**
	如下内容 按照第一列升序分组，当第一列相同时，第二列升序排列
	3    3
	3    1
	3    2
	2    1
	2    2
	1    1
	---------------结果如下
	1    1
	2    1,2
	3    1,2,3
 * @author wuchao
 */
public class GroupSort {

	public static final String INPUT_PATH = "hdfs://hadoop:9000/data";
	public static final String OUT_PATH = "hdfs://hadoop:9000/out";
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		final FileSystem fileSystem = FileSystem.get(new URI(INPUT_PATH), conf);
		fileSystem.delete(new Path(OUT_PATH), true);
		final Job job = Job.getInstance(conf, GroupSort.class.getSimpleName());
		job.setJarByClass(GroupSort.class);
		FileInputFormat.setInputPaths(job, INPUT_PATH);
		job.setInputFormatClass(TextInputFormat.class);
		job.setMapperClass(MyMapper.class);
		job.setMapOutputKeyClass(TwoInt2.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setGroupingComparatorClass(GroupingComparator2.class);
		
		job.setReducerClass(MyReducer.class);
		job.setOutputKeyClass(IntWritable.class);
		job.setOutputValueClass(IntWritable.class);
		FileOutputFormat.setOutputPath(job, new Path(OUT_PATH));
		job.setOutputFormatClass(TextOutputFormat.class);
		job.waitForCompletion(true);
		final FSDataInputStream in = fileSystem.open(new Path(OUT_PATH + "/part-r-00000"));
		IOUtils.copyBytes(in, System.out, 1024, true);
	}

	public static class MyMapper extends Mapper<LongWritable, Text, TwoInt2, IntWritable> {
		final TwoInt2 k2 = new TwoInt2();
		final IntWritable v2 = new IntWritable();
		protected void map(LongWritable key, Text value,
				org.apache.hadoop.mapreduce.Mapper<LongWritable, Text, TwoInt2, IntWritable>.Context context)
				throws java.io.IOException, InterruptedException {
			final String[] splited = value.toString().split("\t");
			k2.set(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]));
			v2.set(Integer.parseInt(splited[1]));
			context.write(k2, v2);
		};
	}

	// 分组后，会产生3个组
	public static class MyReducer extends Reducer<TwoInt2, IntWritable, IntWritable, Text> {
		final IntWritable k3 = new IntWritable();
		final IntWritable v3 = new IntWritable();
		protected void reduce(TwoInt2 key2, java.lang.Iterable<IntWritable> value2s,
				org.apache.hadoop.mapreduce.Reducer<TwoInt2, IntWritable, IntWritable, Text>.Context context)
				throws java.io.IOException, InterruptedException {
			k3.set(key2.first);
			StringBuffer sb = new StringBuffer();
			for (IntWritable val : value2s) {
				sb.append(val + ",");
			}
			if (sb.length() > 0) {
				sb.deleteCharAt(sb.length() - 1);
			}
			context.write(k3, new Text(sb.toString()));
		};
	}
}

class GroupingComparator2 implements RawComparator<TwoInt2> {

	@Override
	public int compare(TwoInt2 o1, TwoInt2 o2) {
		return 0;
	}

	/**
	 * b1 第一个参与比较的字节数组
	 * s1 参与比较的起始字节位置
	 * l1 参与比较的字节长度
	 * b2 第二个参与比较的字节数组
	 * s2 参与比较的起始字节位置
	 * l2 参与比较的字节长度
	 */

	@Override

	public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
		return WritableComparator.compareBytes(b1, s1, 4, b2, s2, 4);
	}

}

class TwoInt2 implements WritableComparable<TwoInt2> {
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
	public int compareTo(TwoInt2 o) {
		if (this.first != o.first) {
			return this.first - o.first;
		} else {
			return this.second - o.second;
		}
	}

}