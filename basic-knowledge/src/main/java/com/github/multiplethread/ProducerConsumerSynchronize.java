package com.github.multiplethread;


class ProducerConsumerDemo1 {
    public static void main(String[] args) {
        Resource1 r = new Resource1();

        Producer1 pro = new Producer1(r);
        Consumer1 con = new Consumer1(r);

        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(pro);
        Thread t3 = new Thread(con);
        Thread t4 = new Thread(con);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

/*
对于多个生产者和消费者。
为什么要定义while判断标记。
原因：让被唤醒的线程再一次判断标记。


为什么定义notifyAll，
因为需要唤醒对方线程。
因为只用notify，容易出现只唤醒本方线程的情况。导致程序中的所有线程都等待。

*/


class Resource1 {
    private String name;
    private int count = 1;
    private boolean flag = false;

    //  t1    t2
    public synchronized void set(String name) {
        while (flag)
            try {
                this.wait();
            } catch (Exception e) {
            }//t1(放弃资格)  t2(获取资格)
        this.name = name + "--" + count++;

        System.out.println(Thread.currentThread().getName() + "...生产者.." + this.name);
        flag = true;
        this.notifyAll();
    }


    //  t3   t4
    public synchronized void out() {
        while (!flag)
            try {
                this.wait();
            } catch (Exception e) {
            }//t3(放弃资格) t4(放弃资格)
        System.out.println(Thread.currentThread().getName() + "...消费者........." + this.name);
        flag = false;
        this.notifyAll();
    }
}

class Producer1 implements Runnable {
    private Resource1 res;

    Producer1(Resource1 res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            res.set("+商品+");
        }
    }
}

class Consumer1 implements Runnable {
    private Resource1 res;

    Consumer1(Resource1 res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            res.out();
        }
    }
}
