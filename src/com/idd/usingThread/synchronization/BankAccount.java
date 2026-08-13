package com.idd.usingThread.synchronization;

public class BankAccount {
    private int balance=100;
    public synchronized void withdrew(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdrew "+amount);
        if (balance >= amount){
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal ");
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+" Withdrawal complete.."+balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance..");
        }

    }
}
