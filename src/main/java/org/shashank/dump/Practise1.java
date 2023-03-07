package org.shashank.dump;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.*;

class Animal{
    public static void move() throws IOException, InterruptedException {

    }
}

class Dog extends Animal{
    public static void move() throws IOException, IllegalArgumentException{

    }
}

public class Practise1 {
    
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // enter data into hashmap
        map.put("Math", 98);
        map.put("Data Structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        List<Map.Entry<String, Integer>> sortedList1 = list.stream().sorted(new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String,Integer> m1, Map.Entry<String,Integer> m2){
                return m1.getKey().compareTo(m2.getKey());
            }
        }).collect(Collectors.toList());


        Map<String, Integer> finalMap1 = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry: sortedList1){
            finalMap1.put(entry.getKey(), entry.getValue());
        }

        List<Map.Entry<String, Integer>> sortedList2 = list.stream()
                .sorted((m1, m2) -> m1.getValue().compareTo(m2.getValue()))
                .collect(Collectors.toList());

        Map<String, Integer> finalMap2 = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry: sortedList2){
            finalMap2.put(entry.getKey(), entry.getValue());
        }

        finalMap1.forEach((key, value) -> System.out.println(key + " -> " + value));
        finalMap2.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
