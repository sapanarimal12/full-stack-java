package com.sapana.day7.singleton;

import com.sapana.day7.singleton.dto.Person;

public class SingletonTester {
    public static void main(String[] args) {

        Person person1 = Person.getInstance();

        person1.setId(1l);
        person1.setName("Sapana");
        person1.setAddress("Nepal");
        person1.setContactNo("9802536633");

        Person person2 = Person.getInstance();

        person2.setId(1l);
        person2.setName("Puja");
        person2.setAddress("Nepal");
        person2.setContactNo("9802536633");

        System.out.println(person1);
        System.out.println(person2);

//        Person person1= new Person(1L,"sapana","nepal","9813283756");
//        Person person2= new Person(1L,"punam","nepal","9813283756");
//        Person person3= new Person(1L,"Puja","nepal","9813283756");
//        Person person4= new Person(1L,"Kunti","nepal","9813283756");
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person4);


    }
}
