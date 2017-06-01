package mr;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;



public class TrasfficStatics extends Configured implements Tool {

	@Override
	public int run(String[] args) throws Exception {
		
		Job job = Job.getInstance(getConf(), "trasffic");
		job.setJarByClass(TrasfficStatics.class);
		
		// set map
		job.setMapperClass(TransfficMpper.class);
		job.setMapOutputKeyClass(LongWritable.class);
		job.setMapOutputValueClass(Transffic.class);
		
		
		// set reduce
		job.setReducerClass(TransfficReduce.class);
		job.setOutputKeyClass(LongWritable.class);
		job.setOutputValueClass(Text.class);
		
		// set input file and output file path
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		job.waitForCompletion(true);
		return 0;
		
	}
	
	public static void main(String[] args) throws Exception  {
		
		// set mapreduce runtime configuration
		Configuration conf = new Configuration();
		ToolRunner.run(conf, new TrasfficStatics(), args);
	}

}


class TransfficMpper extends Mapper<IntWritable, Text, LongWritable, Transffic> {
	@Override
	protected void setup(Mapper<IntWritable, Text, LongWritable, Transffic>.Context context)
			throws IOException, InterruptedException {
	}
	
	@Override
	protected void map(IntWritable key, Text value, Mapper<IntWritable, Text, LongWritable, Transffic>.Context context)
			throws IOException, InterruptedException {
	}
}


class TransfficReduce extends Reducer<LongWritable, Transffic, LongWritable, Text> {
	@Override
	protected void setup(Reducer<LongWritable, Transffic, LongWritable, Text>.Context context)
			throws IOException, InterruptedException {
		super.setup(context);
	}
	
	@Override
	protected void reduce(LongWritable arg0, Iterable<Transffic> arg1,
			Reducer<LongWritable, Transffic, LongWritable, Text>.Context arg2)
			throws IOException, InterruptedException {
		super.reduce(arg0, arg1, arg2);
	}
}


class Transffic implements WritableComparable<Transffic> {
	
	/**
	 * comments
	 */
	private long upPackNum;
	
	/**
	 * comments
	 */
	private long downPackNum;
	
	/**
	 * comments
	 */
	private long upPayLoad;
	
	/**
	 * comments
	 */
	private long downPayLoad;
	
	
	public Transffic() {
		
	}
	
	public Transffic(long upPackNum, long downPackNum, long upPayLoad, long downPayLoad) {
		this.upPackNum = upPackNum;
		this.downPackNum = downPackNum;
		this.upPayLoad = upPayLoad;
		this.downPayLoad = downPayLoad; 
	}
	
	@Override
	public void write(DataOutput out) throws IOException {
		out.writeLong(upPackNum);
		out.writeLong(downPackNum);
		out.writeLong(upPayLoad);
		out.writeLong(downPayLoad);
		
	}
	
	@Override
	public void readFields(DataInput in) throws IOException {
		
		this.upPackNum = in.readLong();
		this.downPackNum = in.readLong();
		this.upPayLoad = in.readLong();
		this.downPayLoad = in.readLong(); 
	}
	
	
	public long getUpPackNum() {
		return upPackNum;
	}
	public void setUpPackNum(long upPackNum) {
		this.upPackNum = upPackNum;
	}
	public long getDownPackNum() {
		return downPackNum;
	}
	public void setDownPackNum(long downPackNum) {
		this.downPackNum = downPackNum;
	}
	public long getUpPayLoad() {
		return upPayLoad;
	}
	public void setUpPayLoad(long upPayLoad) {
		this.upPayLoad = upPayLoad;
	}
	public long getDownPayLoad() {
		return downPayLoad;
	}
	public void setDownPayLoad(long downPayLoad) {
		this.downPayLoad = downPayLoad;
	}

	@Override
	public int compareTo(Transffic o) {
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}

