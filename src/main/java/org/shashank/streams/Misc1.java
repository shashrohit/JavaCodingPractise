package org.shashank.streams;

import java.util.Arrays;
import java.util.List;

public class Misc1 {

    public static void main(String[] args){
        List<String> vehicles = Arrays.asList("bus", "car", "bus", "car", "bike");

        vehicles.stream().distinct().forEach(System.out::println);

        System.out.println(vehicles.stream().distinct().count());

        vehicles.stream().limit(3).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(numbers.stream().filter(n -> n%2 == 0).count());
        System.out.println(numbers.stream().min(
                (n1, n2) -> n1.compareTo(n2)
        ).get());

        Object[] arr = numbers.stream().toArray();
        for(Object e: arr){
            System.out.println(e);
        }
    }
}
