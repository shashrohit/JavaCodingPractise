package org.shashank.problems.misc;

import java.util.ArrayList;
import java.util.List;

public class FindNumbersWithSum {

    public static List<Integer> findNumbersWithSum(int digit, double sum){

        List<Integer> numbers = new ArrayList<>();

        int start = (int) Math.pow(10, digit-1);
        int end = (int) Math.pow(10, digit)-1;
        int curTotal = 0;
        int temp;

        while(start <= end){
            temp = start;
            while(temp!=0){
                curTotal += temp % 10;
                temp = temp /10;
            }

            if(curTotal == sum){
                numbers.add(start);
            }
            start += 1;
            curTotal = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        findNumbersWithSum(3, 6).forEach(System.out::println);
    }
}
