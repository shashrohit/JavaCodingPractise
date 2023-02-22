package org.shashank.knowledge.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Map returns single object while flatmap returns stream of objects
 */

class Person{
    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class FlatMapExample {
    public static void main(String[] args){
        List<Integer> l1 = Arrays.asList(1, 2);
        List<Integer> l2 = Arrays.asList(3, 4);

        List<List<Integer>> fullList = Arrays.asList(l1, l2);

        System.out.println(fullList.stream().flatMap(x -> x.stream()).collect(Collectors.toList()));
        System.out.println(fullList.stream().flatMap(x -> x.stream().map(n -> n*n)).collect(Collectors.toList()));

        List<Person> grp1 = Arrays.asList(new Person(21, "Shashank"), new Person(22, "Rohit"));
        List<Person> grp2 = Arrays.asList(new Person(20, "Singh"), new Person(25, "Sharma"));

        List<List<Person>> people = Arrays.asList(grp1, grp2);

        System.out.println(people.stream().flatMap(x-> x.stream().filter(n -> n.age > 22).map(s -> s.name)).collect(Collectors.toList()));
    }
}
