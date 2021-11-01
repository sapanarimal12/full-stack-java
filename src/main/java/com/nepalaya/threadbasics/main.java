package com.nepalaya.threadbasics;

public class main {
    public static void main(String[] args) {
//        System.out.println("This is thread test!!");
//        System.out.println(Thread.currentThread().getName());
//
//        Thread thread1 =new Thread(() ->{
//            System.out.println(Thread.currentThread().getName());
//
//        });
//        Thread thread2 =new Thread(() ->{
//            System.out.println(Thread.currentThread().getName());
//
//        });
//        Thread thread3 =new Thread(() ->{
//            System.out.println(Thread.currentThread().getName());
//
//        });
//        thread1.start();
//        thread2.start();
//        thread3.start();



//        Thread t1= new Thread();
//        t1.start();
//
//        Painting painting=new Painting();
//        painting.paint("Mona Lisa");
//        Painting painting2=new Painting();
//        painting.paint("Mona Lisa");
//        Painting painting3=new Painting();
//        painting.paint("Mona Lisa");



        Painter painter1=new Painter("Sapana","Mona Lisa1");

        Painter painter2=new Painter("Anita","Mona Lisa2");
        Painter painter3=new Painter("Bhisan","Mona Lisa3");

        painter1.start();
        painter2.start();
        painter3.start();

    }
}
