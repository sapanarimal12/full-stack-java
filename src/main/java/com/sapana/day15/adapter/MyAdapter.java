package com.sapana.day15.adapter;

import com.sapana.day15.adapter.external.MyFileReader;

import java.io.FileReader;


public class MyAdapter implements DataBaseReader{

   private FileReader fileReader;

    public MyAdapter(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public MyAdapter(MyFileReader myFileReader) {
        this.fileReader=fileReader;
    }

    @Override
    public Object executeQuery() {
        String read= fileReader.read();
        String[] lines=read.split(",,");
        Student[] students= new Student[lines.length];
        int i=0;
        for(String s:lines){

            String[] studentLine=s.split(",");
            Student student=new Student();
            student.setId(Long.valueOf(studentLine[0]));
            student.setFname(studentLine[1]);
            student.setLname(studentLine[2]);
            student.setGender(studentLine[3]);
            student.setAge(Long.valueOf(studentLine[4]));
            students[1]=student;
            i++;

        }
        return students;
    }
}
