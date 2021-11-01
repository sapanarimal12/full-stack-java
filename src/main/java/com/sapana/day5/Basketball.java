package com.sapana.day5;

public class Basketball extends Ball {

    @Override public void play() {
        color= "red";
        System.out.println("Playing"  + color + " Basketball");
    }
}