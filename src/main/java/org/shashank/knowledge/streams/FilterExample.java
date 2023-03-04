package org.shashank.knowledge.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Product{

    int price;
    String name;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}

public class FilterExample {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 15);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        numbers.stream().filter(n -> n%2 == 0).forEach(i -> System.out.println(i));
        numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);

        numbers.stream().filter(n -> n%2 == 0 && n > 10).forEach(System.out::println);

        Product p1 = new Product("Apple", 30);
        Product p2 = new Product("Mango", 70);
        Product p3 = new Product("Banana", 10);

        List<Product> products = Arrays.asList(p1, p2, p3);
        products.stream().filter(p -> p.price > 50).forEach(p -> System.out.println(p.name + " is premium."));
    }

}
