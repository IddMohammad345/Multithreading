package com.idd.usingRunnable;

public class Test {
    public static void main(String[] args) {
        World world = new World();
        new Thread(world).start();
    }
}
