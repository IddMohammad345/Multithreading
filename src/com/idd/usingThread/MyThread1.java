package com.idd.usingThread;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start();
    }
}
