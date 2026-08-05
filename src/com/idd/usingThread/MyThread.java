package com.idd.usingThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread();
        System.out.println(t1.getState()); //NEW state
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE state
        Thread.sleep(100);
        System.out.println(t1.getState()); //TIMED_WAITING state
        t1.join();
        System.out.println(t1.getState()); //TERMINATED state
    }
}
