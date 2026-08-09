package com.idd.usingThread.synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter=new Counter();
        MyThread1 t1=new MyThread1(counter);
        MyThread1 t2=new MyThread1(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
