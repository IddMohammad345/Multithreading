package com.idd.usingThread;

public class MyThread1 extends Thread{

    @Override
    public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }


    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1=new MyThread1();
        t1.start();
        t1.join();

        System.out.println("Hello");
    }
}
