package com.sapana.day15.adapter;

import com.sapana.day15.adapter.external.MyFileReader;

public class AdapterMain {
    public static void main(String[] args) {
        DataBaseReader dataBaseReader = new MyAdapter(new MyFileReader());
        Student[] students=(Student[]) dataBaseReader.executeQuery();
        for(Student student:students){
            System.out.println(student);
        }
    }
}
