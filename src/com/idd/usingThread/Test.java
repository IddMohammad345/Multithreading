package com.idd.usingThread;

public class Test {
    public static void main(String[] args) {
        new World().start();
        for (int i=0;i<=10000;i++){
            System.out.println("hello....");
        }
    }
}
