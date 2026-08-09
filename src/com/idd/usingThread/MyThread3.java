package com.idd.usingThread;

/**
 * Interrupted Exception
 */
public class MyThread3 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("thread is running.....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: "+ e);
        }
    }

    public static void main(String[] args) {
        MyThread3 thread3=new MyThread3();
        thread3.start();
        thread3.interrupt(); //thread should be stopped no matter what's its doing
    }
}
