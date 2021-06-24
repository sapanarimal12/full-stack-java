package com.sapana.day7.singleton.dto;

public class Person {
    private Long id;
    private String name;
    private String address;
    private String contactNo;

    private  static  Person person=null;

    private Person() {

    }
    public static Person getInstance(){
            if(person==null){
                person= new Person();
            }
            return person;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", contactNo='" + contactNo + '\'' +
//                '}';
//    }
}
