package org.shashank.knowledge.lambdas.inbuilt.functionalinterfaces;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*
public interface Supplier<T> {
    T get();
    }
 */
public class SupplierInterfaceExample {
    public static void main(String[] args) {
        Supplier<Date> s1 = () -> new Date();

        System.out.println(s1.get());
    }

}
