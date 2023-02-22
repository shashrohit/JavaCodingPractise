package org.shashank.knowledge.streams;

import java.util.Arrays;
import java.util.List;

class OTT{
    String name;
    long subscribers;

    OTT(String name, long subscribers){
        this.name = name;
        this.subscribers = subscribers;
    }
}
public class MapExample {

    public static void main(String[] args){
        List<String> vehicles = Arrays.asList("bus", "car");

        vehicles.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        vehicles.stream().map(String::toUpperCase).forEach(System.out::println);

        vehicles.stream().map(String::length).forEach(System.out::println);

        List<OTT> otts = Arrays.asList(new OTT("Netflix", 1000000),
                new OTT("Disney", 10000));

        otts.stream().filter(ott -> ott.subscribers > 100000).map(ott -> ott.name).forEach(System.out::println);
    }
}
