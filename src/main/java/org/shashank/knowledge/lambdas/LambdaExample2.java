package org.shashank.knowledge.lambdas;

@FunctionalInterface
interface Math{
    void sum(int a, int b);
}

@FunctionalInterface
interface Journey{
    int distance(int source, int dest);
}

public class LambdaExample2 {
    public static void main(String[] args) {
       Math m = (a, b) -> System.out.println(a+b);
       m.sum(10, 20);

       Journey j = (source, destination) -> {
            System.out.println("Source is at " + source + " and destination is at " + destination);
            return destination - source;
        };
        j.distance(10, 30);
    }
}