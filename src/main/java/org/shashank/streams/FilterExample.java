package org.shashank.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Streams are used to process collections
Different methods available -
Intermediary -
Stream<T> filter(Predicate<? super T> predicate);
<R> Stream<R> map(Function<? super T, ? extends R> mapper);
<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
Stream<T> distinct();
Stream<T> sorted();
limit(maxSize)
Stream<T> sorted(Comparator<? super T> comparator);
Stream<T> peek(Consumer<? super T> action);
Stream concat(Stream1, Stream2);

Terminal -
void forEach(Consumer<? super T> action);
Object[] toArray();
<R, A> R collect(Collector<? super T, A, R> collector);
Optional<T> min(Comparator<? super T> comparator);
Optional<T> max(Comparator<? super T> comparator);
long count();
boolean anyMatch(Predicate<? super T> predicate);
boolean allMatch(Predicate<? super T> predicate);
boolean noneMatch(Predicate<? super T> predicate);
Optional<T> findFirst();
Optional<T> findAny();
 */

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
