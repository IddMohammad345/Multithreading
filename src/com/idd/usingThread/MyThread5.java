package com.idd.usingThread;

public class MyThread5 extends Thread{

    @Override
    public void run() {
        while (true){
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        MyThread5 thread5=new MyThread5();
        thread5.setDaemon(true);
        thread5.start();
        MyThread5 thread51=new MyThread5();//user thread
        thread51.start();
        System.out.println("Main done");
    }
}
