package org.shashank.lambdas;


import java.util.function.Consumer;

/*
public interface Consumer<T> {
    void accept(T t);
}
 */

public class ConsumerInterfaceExample {

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Shashank");
    }
}