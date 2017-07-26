package com.github.io;

class Resource {
	private boolean flag = false;
	private int count = 0;

	public synchronized void addResource() {
		while (this.flag) {
			try{
				this.wait();
			} catch(Exception e) {
			}
		}
		System.out.println(Thread.currentThread().getName() + " ->->->->->-> add.............." + ++count);
		flag = true;
		this.notifyAll();
	} 	
	
	public synchronized void useResource() {
		while (!this.flag) {
			try{
				this.wait();
			} catch(Exception e) {
			} 
		}
			
		System.out.println(Thread.currentThread().getName() + " <<<<<<< use....." + --count);
		flag = false;
		this.notifyAll();

	}
}


class Input implements Runnable {
	
	private Resource res;
	Input(Resource res) {
		this.res = res;
	}
	public void run() {
		while (true) {
			res.addResource();
		}
	}
	
}

class Output implements Runnable {
	
	private Resource res;
	Output(Resource res) {
		this.res = res;
	}
	public void run() {
		while (true) {			
			res.useResource();
		}		
	}
}


class InputOutPutMultiple {
	public static void main(String[] args) {
		
		Resource res = new Resource();
		new Thread(new Input(res)).start();
		new Thread(new Input(res)).start();
		new Thread(new Output(res)).start();
		new Thread(new Output(res)).start();

	}
}