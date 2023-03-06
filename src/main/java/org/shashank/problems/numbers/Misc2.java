package org.shashank.problems.numbers;

public class Misc2 {

    public static int factorial(int number){
        if(number<=1){
            return 1;
        }else{
            return number*factorial(number-1);
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

        System.out.println(sumOfDigits(124));
    }
}
