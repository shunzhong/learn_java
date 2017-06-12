package com.github.learn.niothread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class ThreadAdvance {
	public static void main(String[] args) throws Exception {
		FutureTask<String> task = new FutureTask<String>(new Callable<String>() {

			@Override
			public String call() throws Exception {
				return null;
			}
		});
		new Thread(task).start();
		
		Thread.sleep(10000);
		
		TimeUnit.SECONDS.sleep(100);
		
		new Thread(){
			public void run() {};
		};
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
			}
		}).start();
		
		ThreadGroup tGroup = new ThreadGroup("");
		
		tGroup.list();
		
		Thread[] tsThreads = new Thread[tGroup.activeCount()];
		tGroup.enumerate(tsThreads);
		
	}
	
	
}
