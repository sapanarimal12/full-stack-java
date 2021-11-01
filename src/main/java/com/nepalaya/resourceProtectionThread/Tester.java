package com.nepalaya.resourceProtectionThread;

public class Tester {

    public static void main(String[] args) {
        Account sapanaAccount=new Account();

        System.out.println("Balance before transaction:"+sapanaAccount.getBalance());


        Transaction withDrawer=(account )->{
            Double amount=1.0;
            for(int i=0;i<=10;i++){
                account.withDraw(amount);

            }

        };
        Transaction depositor=(account )->{
            Double amount=1.0;
            for(int i=0;i<=10;i++){
                account.deposit(amount);

            }

        };

        for (int i=1;i<=100;i++){
            if(i%2==0){
                new Thread(new User(sapanaAccount,depositor),"depositor").start();
            }
            else {
                new Thread(new User(sapanaAccount,withDrawer),"withdrawer").start();
            }
        }
        System.out.println("Balance after transaction:"+sapanaAccount.getBalance());

    }
}
