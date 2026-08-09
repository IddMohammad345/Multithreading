package com.idd.usingThread;

/**
 * Thread.yield() method
 */
public class MyThread4 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" is running");
            Thread.yield();// it will give a chance to execute another thread
        }
    }

    public static void main(String[] args) {
        MyThread4 thread41=new MyThread4();
        MyThread4 thread42=new MyThread4();
        thread41.start();
        thread42.start();

    }
}
