package com.sapana.day16.facade;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebCaller {
    public Document call(String website){
        try{
           return   Jsoup.connect(website).get();


        }
        catch (Exception ex){

        }
        return  null;

    }

}
