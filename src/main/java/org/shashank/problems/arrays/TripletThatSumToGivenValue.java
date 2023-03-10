package org.shashank.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class TripletThatSumToGivenValue {

    public static void find3Numbers(int[] arr, int sum){
        Set<Integer> set;
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            set = new HashSet<>();
            int remainingSum = sum-arr[i];
            for(int j=i+1; j<n; j++){
                if(set.contains(remainingSum-arr[j])){
                    System.out.println("Triplets are - "+ arr[i] + ", "
                            + arr[j] + " and " + (remainingSum-arr[j]));
                }
                set.add(arr[j]);
            }
        }

    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;

        find3Numbers(arr, sum);
    }
}
