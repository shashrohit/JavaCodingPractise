package org.shashank.problems.misc;

import java.util.Arrays;

public class SortBinaryArray {

    public static int[] sort(int[] arr){
        int count = -1;
        int temp;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                count +=1;
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0})));
    }
}
