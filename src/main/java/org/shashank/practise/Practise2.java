package org.shashank.practise;

import java.util.*;

public class Practise2 {



    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0})));
    }

    private static int[] sort(int[] arr) {
        int count =-1, temp;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 1){
                count += 1;
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
