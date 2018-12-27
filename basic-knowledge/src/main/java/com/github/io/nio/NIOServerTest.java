package com.github.io.nio;

import com.github.io.nio.client.Client;
import com.github.io.nio.server.Server;

import java.util.Scanner;

/**
 * Created by shunzhong.deng on 7/25/17.
 */
public class NIOServerTest {
    //测试主方法
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception{
        //运行服务器
        Server.start();
        //避免客户端先于服务器启动前执行代码
        Thread.sleep(100);
        //运行客户端
        Client.start();
        while(Client.sendMsg(new Scanner(System.in).nextLine()));
    }
}
