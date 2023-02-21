package org.shashank.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Misc3 {

    public static void main(String[] args) {
        //---------------- Get the Cumulative sum of a list ----------------
        int[] arr = {10, 20, 30, 40, 50, 70};
        int[] result = new int[arr.length];
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            for(int j = 0; j <= i; j++){
                sum += arr[j];
            }
            result[i] = sum;
            sum = 0;
        }
        System.out.println(Arrays.toString(result));
    }
}
