package com.github.learn.niothread;

import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class ExchangerDemo {

	public static void main(String[] args) {
		final Exchanger<String> exchanger = new Exchanger<String>();
		// for (int i = 0; i < 3; i++) {

		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					System.out.println(Thread.currentThread().getName() + ": 卖包子。。。");
					TimeUnit.SECONDS.sleep(new Random().nextInt(5));
					String data1 = "包子";
					String data2 = exchanger.exchange(data1);
					System.out.println(Thread.currentThread().getName() + " : 拿到了" + data2);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					System.out.println("-->" + Thread.currentThread().getName() + ": 买包子。。。");
					TimeUnit.SECONDS.sleep(new Random().nextInt(5));
					String data1 = "10元";
					String data2 = exchanger.exchange(data1);
					System.out.println(Thread.currentThread().getName() + " : 拿到了" + data2);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		// }
	}
}
