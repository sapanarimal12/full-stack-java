package com.sapana.pubsubpattern.extraCode;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
 public abstract class SubSriber {

    private List<Message> subscriberMsg = new ArrayList<>();

    public abstract void subscribe(String topic, PubSubservice pubSubService);
    public abstract void unsubscribe(String topic, PubSubservice pubSubService);
}

