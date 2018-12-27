package com.github.io.bio;
import java.util.concurrent.locks.*;
class Resource2 {
	private boolean flag = false;
	private int count = 0;

	Lock lock = new ReentrantLock();
	Condition producerCon = lock.newCondition();
	Condition consumerCon = lock.newCondition();
	public void addResource() {
		lock.lock();
		try {
			while (this.flag) {
				producerCon.await();
			}
			System.out.println(Thread.currentThread().getName() + " ->->->->->-> add.............." + ++count);
			flag = true;
			consumerCon.signal();
		} catch (Exception e) { 
			System.out.println("exception ******************** add");
		} finally {
			lock.unlock();
		}
		
		
	} 	
	
	public void useResource() {
		lock.lock();
		try { 
			while (!this.flag) {
				consumerCon.await();
			}
				
			System.out.println(Thread.currentThread().getName() + " <<<<<<< use....." + --count);
			flag = false;
			producerCon.signal();

		} catch (Exception e) {
			System.out.println("exception ############### use");
		} finally {
			lock.unlock();
		}
	}
}


class Input2 implements Runnable {
	
	private Resource2 res;
	Input2(Resource2 res) {
		this.res = res;
	}
	public void run() {
		while (true) {
			res.addResource();
		}
	}
	
}

class Output2 implements Runnable {
	
	private Resource2 res;
	Output2(Resource2 res) {
		this.res = res;
	}
	public void run() {
		while (true) {			
			res.useResource();
		}		
	}
}


class InputOutPutMultiple2 {
	public static void main(String[] args) {
		
		Resource2 res = new Resource2();
		new Thread(new Input2(res)).start();
		new Thread(new Input2(res)).start();
		new Thread(new Output2(res)).start();
		new Thread(new Output2(res)).start();

	}
}