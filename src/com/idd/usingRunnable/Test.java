package com.idd.usingRunnable;

public class Test {
    public static void main(String[] args) {
        World world = new World(); //Now thread is in new state
        new Thread(world).start();//now thread is in Runnable state
    }
}
