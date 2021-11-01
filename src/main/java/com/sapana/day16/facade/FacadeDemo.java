package com.sapana.day16.facade;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacadeDemo {
    public static void main(String[] args) throws IOException {

        JobScraperFacade jobScraperFacade=new JobScraperFacade();
        List<JobDetail> jobs = jobScraperFacade.scrap("merojob","java");

        System.out.println(jobs);

    }

}
