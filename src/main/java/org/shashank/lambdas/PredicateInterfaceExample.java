package org.shashank.lambdas;

import java.util.function.Predicate;

/*
java.util.function
1. Predicate
2. Functional
3. Consumer
4. Supplier

Predicate -
interface Predicate<T>{
    boolean test(T arg);
}
Use when conditional checks needed.
We can also join predicates using and method
 */

class Employee{
    int age;
    String name;

    Employee(int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class PredicateInterfaceExample {

    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i > 10;
        System.out.println(p1.test(11));

        Predicate<String> p2 = s -> s.length() > 10;
        System.out.println(p2.test("Shashank"));

        Employee emp1 = new Employee(30,"Rohit");
        Predicate<Employee> p3 = e -> (e.age > 10 && e.name!= null);
        System.out.println(p3.test(emp1));

        Predicate<Integer> p4 = i -> i%2 == 0;
        Predicate<Integer> p5 = i -> i < 5;

        System.out.println(p4.and(p5).test(10));
        System.out.println(p4.or(p5).test(10));
    }
}
