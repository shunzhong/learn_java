package com.github.learn.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOTest {

	public static void main(String[] args) throws IOException {

	}

	public static void fileChannelExample() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("/data/nio-data", "rw");
		FileChannel inChannel = aFile.getChannel();

		// 创建一个容量为 48字节的缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(48);
		int bytesRead = 0;

		// 读取数据到缓冲区
		while ((bytesRead = inChannel.read(buffer)) != -1) {
			System.out.println(bytesRead);

			// 标记缓冲区进入读取模式
			buffer.flip();

			while (buffer.hasRemaining()) {

				// 读取单个字节
				System.out.println((char) buffer.get());
			}

			// 标记缓冲区进入写模式
			buffer.clear();
		}
		aFile.close();

	}

	public static void scatterAndGather() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("/data/nio-data", "rw");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer buffera = ByteBuffer.allocate(48);
		ByteBuffer bufferb = ByteBuffer.allocate(1024);

		ByteBuffer[] arrayBuffer = { buffera, bufferb };

		inChannel.read(arrayBuffer);
		// inChannel.write(arrayBuffer);

	}

	private static void fileChannelTransFileChannel() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("/data/nio-data", "rw");
		FileChannel aChannel = aFile.getChannel();

		RandomAccessFile bFile = new RandomAccessFile("/data/nio-data1", "rw");
		FileChannel bChannel = bFile.getChannel();

		aChannel.transferFrom(bChannel, 0, bChannel.size());

		// aChannel.transferTo(0, aChannel.size(), bChannel);
	}

	private static void selectorExample() throws IOException {

		Selector selector = Selector.open();
		ServerSocketChannel sChannel = ServerSocketChannel.open();
		sChannel.socket().bind(new InetSocketAddress(9999));
		sChannel.configureBlocking(false);

		// int interestSet = SelectionKey.OP_READ | SelectionKey.OP_WRITE;
		SelectionKey key = sChannel.register(selector, SelectionKey.OP_READ);

		while (true) {
			int readyChannels = selector.select();
			if (readyChannels == 0)
				continue;

			Set<SelectionKey> selectedKeys = selector.selectedKeys();
			Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
			while (keyIterator.hasNext()) {

				SelectionKey outKey = keyIterator.next();

				if (outKey.isAcceptable()) {
					// a connection was accepted by a ServerSocketChannel.
				} else if (outKey.isConnectable()) {
					// a connection was established with a remote server.
				} else if (outKey.isReadable()) {
					// a channel is ready for reading
				} else if (outKey.isWritable()) {
					// a channel is ready for writing
				}
				keyIterator.remove();

			}

		}

	}

	public static void ConnectAsync() throws Exception {
		String host = "localhost";
		int port = 80;

		InetSocketAddress addr = new InetSocketAddress(host, port);
		SocketChannel sc = SocketChannel.open();
		sc.configureBlocking(false);
		System.out.println("initiating connection");
		sc.connect(addr);
		while (!sc.finishConnect()) {
			doSomethingUseful();
		}
		System.out.println("connection established");
		// Do something with the connected socket
		// The SocketChannel is still nonblocking
		sc.close();
	}

	private static void doSomethingUseful() {
		System.out.println("doing something useless");
	}

}
