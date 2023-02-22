package org.shashank.knowledge.problems.arrays;

import java.util.Arrays;

public class MissingNumber {

    public static int fineMissingNumber(int[] arr){
        int sum = Arrays.stream(arr).sum();
        int n = arr.length;
        int expectedSum = (n+1) * (n+2)/2;
        return expectedSum - sum;
    }
    public static void main(String[] args) {
        System.out.println(fineMissingNumber(new int[]{1, 2, 4, 5, 6, 7}));
    }
}
