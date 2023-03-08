package org.shashank.dump;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

class Animal{
    public static void move() throws IOException, InterruptedException {

    }
}

class Dog extends Animal{
    public static void move() throws IOException, IllegalArgumentException{

    }
}

public class Practise1 {

    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci((n-1)) + fibonacci(n-2);
    }
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // enter data into hashmap
        map.put("Math", 98);
        map.put("Data Structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
    }
}
