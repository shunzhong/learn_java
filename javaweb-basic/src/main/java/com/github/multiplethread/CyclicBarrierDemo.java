package com.github.multiplethread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		final CyclicBarrier cb = new CyclicBarrier(4);

		for (int i = 0; i < 4; i++) {

			new Thread(new Runnable() {

				@Override
				public void run() {

					try {
						System.out.println(Thread.currentThread().getName() + " :爬山。。。");
						TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
						System.out.println(Thread.currentThread().getName() + " :到达山顶了。。。");
						cb.await();// 等待，直到计数器变为0为止

						System.out.println(Thread.currentThread().getName() + " :吃饭。。。");
						TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
						System.out.println(Thread.currentThread().getName() + " :吃完饭了。。。");
						cb.await();// 等待，直到计数器变为0为止

						System.out.println(Thread.currentThread().getName() + " :KTV。。。");
						TimeUnit.SECONDS.sleep(new Random().nextInt(5) + 1);
						System.out.println(Thread.currentThread().getName() + " :唱完歌了。。。");
						cb.await();// 等待，直到计数器变为0为止

						System.out.println(Thread.currentThread().getName() + "：回家");

					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						e.printStackTrace();
					}

				}
			}).start();
		}

	}
}
