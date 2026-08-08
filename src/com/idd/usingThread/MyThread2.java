package com.idd.usingThread;

public class MyThread2 extends Thread{

    public MyThread2(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName() +" - Priority: "+ Thread.currentThread().getPriority()+ " -count " + i);
            try {
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread2 l=new MyThread2("Low priority thread");
        MyThread2 m=new MyThread2("Medium priority thread");
        MyThread2 h=new MyThread2("High priority thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
