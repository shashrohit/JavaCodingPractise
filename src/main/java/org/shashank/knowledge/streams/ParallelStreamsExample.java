package org.shashank.knowledge.streams;

import java.util.Arrays;
import java.util.List;

class Sport{

    String name;
    String type;

    Sport(String name, String type){
        this.name = name;
        this.type = type;
    }
}
public class ParallelStreamsExample {

    public static void main(String[] args) {

        List<Sport> sports = Arrays.asList(new Sport("Tennis", "Ind"), new Sport("Soccer", "Team"));

        sports.parallelStream().filter(t -> t.type.equalsIgnoreCase("Ind")).forEach(n -> System.out.println(n.name));
    }
}