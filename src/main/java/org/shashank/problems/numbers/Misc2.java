package org.shashank.problems.numbers;

public class Misc2 {

    public static int factorial(int number){
        if(number<=1){
            return 1;
        }else{
            return number*factorial(number-1);
        }
    }

    public static int fibonacci(int number){
        if(number <=1 ){
            return number;
        }else{
            return fibonacci(number-1) + fibonacci(number-2);
        }
    }

    public static int sumOfDigits(int number){
        if(number < 1){
            return 0;
        }else{
            return number%10 + sumOfDigits(number/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

        for(int i=0; i<5; i++){
            System.out.println(fibonacci(i));
        }

        System.out.println(sumOfDigits(124));
    }
}
