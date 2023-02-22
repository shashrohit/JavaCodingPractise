package org.shashank.knowledge.lambdas;

/*
public void func1(){
    System.out.println("Hello");
}
() -> System.out.println("Hello");

public void func2(int a, int b){
    System.out.println(a+b);
}

(a,b) -> System.out.println(a+b);

public void func3(int a){
    return a*a;
}

(a) -> {return a*a;};
OR
(a) -> a*a;
OR
a -> a*a;

Lambda expressions can only be invoked by functional interfaces.
Functional interface is an interface that contains single abstract method.
But we can have any no. of default and static methods.
Runnable -> run()
Callable -> call()
Comparable -> compareTo()
ActionListener -> actionPerformed()
 */
@FunctionalInterface
interface Cab{
    void bookCab();
}

class Ola implements Cab{

    @Override
    public void bookCab() {
        System.out.println("Ola cab is booked.");
    }
}
public class LambdaExample1 {
    public static void main(String[] args) {
        Cab cab1 = new Ola();
        cab1.bookCab();

        // We can avoid creating Ola class by using lambda expression
        Cab cab2 = () -> System.out.println("Uber cab is booked.");
        cab2.bookCab();
    }
}