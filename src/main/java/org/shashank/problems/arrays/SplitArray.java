package org.shashank.problems.arrays;

import java.util.Arrays;

public class SplitArray {

    public static int[] split(int[] arr, int index){
        int key, i, j;
        for(i=0; i<index; i++){
            key = arr[0];
            for(j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        Arrays.stream(split(new int[]{12, 10, 5, 6, 52, 36}, 2)).forEach(System.out::println);
    }
}
