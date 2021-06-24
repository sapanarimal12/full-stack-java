package com.sapana.day7.singleton.dto;

public class student {
    private static long id1;
    private  String name;

    public student(String name) {
        id1++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id ='" + id1 + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
