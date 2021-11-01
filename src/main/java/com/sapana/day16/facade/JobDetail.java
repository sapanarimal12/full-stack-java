package com.sapana.day16.facade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

public class JobDetail {

    private  String companyImageUrl;
    private String title;
    private String company;
    private String companyAddress;
    private List<String> keySkill;
    private String deadline;
    private  Integer views;


}

