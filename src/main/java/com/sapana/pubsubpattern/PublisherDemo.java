package com.sapana.pubsubpattern;

public class PublisherDemo {
    public static void main(String[] args) {
        System.out.println("Publish subscribe day!");
        Video twentySeven = new Video();
        twentySeven.setTitle("27");
        twentySeven.setDescription("NEw music video for my album");
        twentySeven.setVideoBytes(new Object());


        Channel mgk = new Channel();
        mgk.setName("Machine Gun kelley");

        Subscriber subscriber1 = new Subscriber(1l,"Sapana");
        Subscriber subscriber2 = new Subscriber(2l,"Anita");
        Subscriber subscriber3 = new Subscriber(3l,"Bapana");
        Subscriber subscriber4 = new Subscriber(4l,"Kalpana");

        mgk.subscribe(subscriber1);
        mgk.subscribe(subscriber2);
        mgk.subscribe(subscriber3);
        mgk.subscribe(subscriber4);

        mgk.publish(twentySeven);


    }

}
