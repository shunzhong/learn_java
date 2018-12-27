package com.github.io.bio;

import com.github.io.bio.socketio.Client;
import com.github.io.bio.socketio.ServerNormal;

import java.io.IOException;
import java.util.Random;

/**
 * Created by shunzhong.deng on 7/26/17.
 */
public class BIOTest {
    //测试主方法
    public static void main(String[] args) throws InterruptedException {
        //运行服务器
        new Thread(new Runnable() {
            public void run() {
                try {
                    ServerNormal.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        //避免客户端先于服务器启动前执行代码
        Thread.sleep(100);
        //运行客户端
        final char operators[] = {'+','-','*','/'};
        final  Random random = new Random(System.currentTimeMillis());
        new Thread(new Runnable() {
            public void run() {
                while(true){
                    //随机产生算术表达式
                    String expression = random.nextInt(10)+""+operators[random.nextInt(4)]+(random.nextInt(10)+1);
                    Client.send(expression);
                    try {
                        Thread.currentThread().sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
