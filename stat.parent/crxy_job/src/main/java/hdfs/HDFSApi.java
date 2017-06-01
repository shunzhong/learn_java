package hdfs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.URIException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.MapFile;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.SequenceFile.Writer;

public class HDFSApi {
	static final String PATH = "hdfs://192.168.88.108:9000/d1";
	static final String DIR = "/d1";
	static final String FILE = "/d1/hello";

	public static void main(String[] args) throws Exception {
		FileSystem fileSystem = getFileSystem();
		// 创建文件夹 hadoop fs -mkdir /f1
		// mkdir(fileSystem);
		// 上传文件 -put src des
		putData(fileSystem);
		// 下载文件 hadoop fs -get src des
		// getData(fileSystem);
		// 浏览文件夹
		// list(fileSystem);
		// 删除文件夹
		// remove(fileSystem);
	}

	/**
	 * 合并小文件，手动编码
	 * 
	 * @param fileSystem
	 * @throws Exception
	 */
	private static void combineFile(FileSystem fileSystem) throws Exception {
		final Path path = new Path("/combinedfile");
		final FSDataOutputStream create = fileSystem.create(path);
		final File dir = new File("C:\\Windows\\System32\\drivers\\etc");
		for (File fileName : dir.listFiles()) {
			System.out.println(fileName.getAbsolutePath());
			final FileInputStream fileInputStream = new FileInputStream(fileName.getAbsolutePath());
			final List<String> readLines = /*
											 * IOUtils.readLines(fileInputStream)
											 */ new ArrayList<String>();
			for (String line : readLines) {
				create.write(line.getBytes());
			}
			fileInputStream.close();
		}
		create.close();

	}

	/**
	 * 加载用户自定义文件以及，设置属性
	 */
	private static void consumerConfigration() {
		// 1.加载默认配置文件
		Configuration configuration = new Configuration();
		// 2.加载用户自定义的配置文件
		configuration.addResource("hdfs/core-site.xml");
		// configuration.writeXml(System.out);
		// 3.加载用户在程序中指定的配置信息
		configuration.set("fs.defaultFS", "aaaaaaaaaaaaaaa");

		System.out.println(configuration.get("fs.defaultFS"));
	}

	/**
	 * 获取当前目录下所有文件元数据信息
	 * 
	 * @param fileSystem
	 * @throws IOException
	 */
	private static void list(FileSystem fileSystem) throws IOException {
		final FileStatus[] listStatus = fileSystem.listStatus(new Path("/"));
		for (FileStatus fileStatus : listStatus) {
			String isDir = fileStatus.isDirectory() ? "文件夹" : "文件";
			final String permission = fileStatus.getPermission().toString();
			final short replication = fileStatus.getReplication();
			final long len = fileStatus.getLen();
			final String path = fileStatus.getPath().toString();
			System.out.println(isDir + "\t" + permission + "\t" + replication + "\t" + len + "\t" + path);
		}
	}

	/**
	 * 读写sequencefile
	 * 
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	private static void operationSequenceFile() throws IOException, URISyntaxException {
		final Configuration conf = new Configuration();
		final FileSystem fs = FileSystem.get(new URI(PATH), conf);
		// 写操作
		final Writer writer = new SequenceFile.Writer(fs, conf, new Path("/sf"), LongWritable.class, Text.class);
		writer.append(new LongWritable(1), new Text("111"));
		IOUtils.closeStream(writer);

		// 读操作
		final SequenceFile.Reader reader = new SequenceFile.Reader(fs, new Path("/sf"), conf);
		final LongWritable key = new LongWritable();
		final Text val = new Text();
		while (reader.next(key, val)) {
			System.out.println(key.get() + "\t" + val.toString());
		}
		IOUtils.closeStream(reader);
	}

	/**
	 * 读写MapFile，MapFile 是 key 排序的 sequenceFile。Mapfile
	 * @throws IOException
	 * @throws URIException
	 */
	private static void operationMapFile() throws IOException, URIException {
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		Path mapFile = new Path(PATH);

		// Writer内部类用于文件的写操作,假设Key和Value都为Text类型
		MapFile.Writer writer = new MapFile.Writer(conf, fs, mapFile.toString(), Text.class, Text.class);

		// 通过writer向文档中写入记录
		writer.append(new Text("key"), new Text("value"));
		IOUtils.closeStream(writer);// 关闭write流

		// Reader内部类用于文件的读取操作
		MapFile.Reader reader = new MapFile.Reader(fs, mapFile.toString(), conf);

		// 通过reader从文档中读取记录
		Text key = new Text();
		Text value = new Text();
		while (reader.next(key, value)) {
			System.out.println(key);
			System.out.println(key);
		}
		IOUtils.closeStream(reader);// 关闭read流

	}

	/**
	 * 读取HDFS分布式文件系统的文件信息
	 * 
	 * @param fileSystem
	 * @throws IOException
	 */
	private static void getData(FileSystem fileSystem) throws IOException {
		final FSDataInputStream in = fileSystem.open(new Path(FILE));
		IOUtils.copyBytes(in, System.out, 1024, true);
	}

	/**
	 * 向HDFS提交文件
	 * 
	 * @param fileSystem
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void putData(FileSystem fileSystem) throws IOException, FileNotFoundException {
		final FSDataOutputStream out = fileSystem.create(new Path(FILE));
		final FileInputStream in = new FileInputStream("e:/tl.txt");
		IOUtils.copyBytes(in, out, 1024, true);
	}

	/**
	 * 从HDFS中删除文件
	 * 
	 * @param fileSystem
	 * @throws IOException
	 */
	private static void remove(FileSystem fileSystem) throws IOException {
		fileSystem.delete(new Path(DIR), true);
	}

	/**
	 * 在HDFS中创建目录
	 * 
	 * @param fileSystem
	 * @throws IOException
	 */
	private static void mkdir(FileSystem fileSystem) throws IOException {
		fileSystem.mkdirs(new Path(DIR));
	}

	/**
	 * 获取指定目录的文件系统信息
	 * 
	 * @return
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	private static FileSystem getFileSystem() throws IOException, URISyntaxException {
		return FileSystem.get(new URI(PATH), new Configuration());
	}
}
