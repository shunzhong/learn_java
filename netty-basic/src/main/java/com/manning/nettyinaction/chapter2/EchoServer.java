package com.manning.nettyinaction.chapter2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoop;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * Listing 2.3  of <i>Netty in Action</i>
 *
 * @author <a href="mailto:nmaurer@redhat.com">Norman Maurer</a>
 */
public class EchoServer {

    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println(
                    "Usage: " + EchoServer.class.getSimpleName() +
                            " <port>");
            return;
        }
        int port = Integer.parseInt(args[0]);
        new EchoServer(port).start();
    }

    public void start() throws Exception {

        // 创建EventLoopGroup
        EventLoopGroup group = new NioEventLoopGroup();

        final EchoServerHandler serverHandler = new EchoServerHandler();
        try {

            // 创建ServerBootstrap
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(group)
                    // 指定所使用NIO传输的channel 通道
                    .channel(NioServerSocketChannel.class)

                    // 使用指定的套接字地址
                    .localAddress(new InetSocketAddress(port))

                    // 添加一个EchoServerHandler到子的ChannelPipeline
                    // ChannelInitializer 当新的连接被接受时，一个新的Channel将会被创建
                    // 而 ChannelInitializer 将会把你的EchoServerHandler实例
                    // 添加到该Channel的ChannelPipeline
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch)
                                throws Exception {

                            // EchoServerHandler 被标注为@Shareable，所以可以使用相同的实例
                            ch.pipeline().addLast(serverHandler);
                        }
                    });

            // 异步的绑定服务器调用sync方法阻塞等待直到绑定完成
            ChannelFuture channelFuture = serverBootstrap.bind().sync();
            System.out.println(EchoServer.class.getName() + " started and listen on " + channelFuture.channel().localAddress());

            // 获取Channel的CloseFuture，并且阻塞当前线程直到它完成
            channelFuture.channel().closeFuture().sync();
        } finally {

            // 关闭EventLoopGroup释放所有的资源
            group.shutdownGracefully().sync();
        }
    }
}

