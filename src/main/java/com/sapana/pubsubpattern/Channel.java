package com.sapana.pubsubpattern;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter


public class Channel {
    private  String name;
    private Long id;
    private String description;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void publish(Video video){
        System.out.println("Publishing the content");

        for (Subscriber subscriber:subscribers){
            subscriber.notify("New Content from "+name+"'"+video.getTitle()+"");
        }
    }

    public  void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
}
