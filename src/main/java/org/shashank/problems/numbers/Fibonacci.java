package org.shashank.problems.numbers;

public class Fibonacci {

    // O(2^n)
    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // O(n)
    public static void fibonacci2(int n){
        int a=0, b=1;
        int temp;
        for(int i=0; i<n; i++){
            System.out.println(a);
            temp = a +b;
            a=b;
            b=temp;
        }
    }

    public static void main(String[] args) {

        // print first 5 numbers
        int n =5;
        for(int i=0; i<n; i++){
            System.out.println(fibonacci(i));
        }

        // print 5th number
        System.out.println("The 5th number is - " + fibonacci(n-1));

        fibonacci2(6);

    }
}
