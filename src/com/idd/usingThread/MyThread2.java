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
        MyThread2 thread2=new MyThread2("Idd");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
    }
}
