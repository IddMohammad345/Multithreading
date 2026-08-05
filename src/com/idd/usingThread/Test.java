package com.idd.usingThread;

public class Test {
    public static void main(String[] args) {
        new World()  //now thread is in new state
                .start();  //Now thead is in runnable state
        for (int i=0;i<=10000;i++){
            System.out.println("hello....");
        }
    }
}
