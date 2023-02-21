package org.shashank.problems.misc;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                arr[count] = arr[i];
                count += 1;
            }
        }

        while(count < arr.length){
            arr[count] = 0;
            count += 1;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

}
