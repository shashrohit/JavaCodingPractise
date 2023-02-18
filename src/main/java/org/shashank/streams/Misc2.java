package org.shashank.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Misc2 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 4, 3, 5, 10, 7, 8);
        numbers.stream().sorted().forEach(System.out::println);
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println(fruits.stream().anyMatch(n -> n.startsWith("App")));
        System.out.println(fruits.stream().allMatch(n -> n.startsWith("App")));
        System.out.println(fruits.stream().noneMatch(n -> n.startsWith("App")));

        System.out.println(fruits.stream().findAny().get());
        System.out.println(fruits.stream().findFirst().get());

        List<Integer> moreNumbers = Arrays.asList(11, 12,14);

        Stream<Integer> s1 = numbers.stream();
        Stream<Integer> s2 = moreNumbers.stream();

        Stream.concat(s1, s2).collect(Collectors.toList()).forEach(System.out::println);
    }
}
