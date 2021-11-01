package com.nepalaya.resourceProtectionThread;

public class Account {
    public final Object object=new Object();

    public Double balance=0.0;

    public Double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

    }
    public  void withDraw(Double amount){
        synchronized (object) {
            System.out.println("Performing withdraw by:"+Thread.currentThread().getName());
            //write   //read    //read
            balance = balance - amount;
        }
    }
    public  void deposit(Double amount){
        synchronized (object) {

            System.out.println("Performing deposit by:"+Thread.currentThread().getName());
            balance = balance + amount;
        }
    }

}
