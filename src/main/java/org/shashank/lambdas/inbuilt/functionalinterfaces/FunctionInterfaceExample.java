package org.shashank.lambdas.inbuilt.functionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

/*
public interface Function<T, R>{
    R apply(T t);
}
 */

class Student{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class FunctionInterfaceExample {

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i*i;
        System.out.println(f1.apply(10));

        Function<String, Integer> f2 = i -> i.length();
        System.out.println(f2.apply("Shashank"));

        Student s1 = new Student(10, "A");
        Student s2 = new Student(20, "B");
        Student s3 = new Student(5, "C");

        Function<Student, String> f3 = s -> {
            int age = s.age;
            if(age <= 5){
                return "Pre-school";

            }else if(age <=10){
                return "High school";
            }
            else{
                return "College";
            }
        };

        Predicate<String> p1 = e -> e.equalsIgnoreCase("Pre-school");

        System.out.println(f3.apply(s1));
        System.out.println(f3.apply(s2));
        System.out.println(f3.apply(s3));

        System.out.println(p1.test(f3.apply(s1)));

        Function<Integer, Integer> f4 = i -> i*i;
        Function<Integer, Integer> f5 = i -> i*i*i;

        System.out.println(f4.andThen(f5).apply(10));
        System.out.println(f4.compose(f5).apply(10));
    }
}