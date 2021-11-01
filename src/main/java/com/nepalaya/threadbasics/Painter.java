package com.nepalaya.threadbasics;

import java.util.Date;

public class Painter extends Thread {

    public String painting;

    public Painter(String name,String painting) {
        super(name);
        this.painting = painting;
    }

    public  void paint(){
        String  name=Thread.currentThread().getName();
        System.out.println("Painter"+name+"started painting at:"+new Date().getTime());
         System.out.println("Painter is painting:" + new Painting(painting,name));


 }

    @Override
    public void run() {
        paint();
    }
}
