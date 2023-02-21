package org.shashank.problems.misc;

import java.util.Arrays;

public class GroupPositiveNegativeNumbers {

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int key, j;

        for(int i = 1; i < arr.length; i++){
            key = arr[i];
            if(key > 0){
                continue;
            }
            j = i -1;
            while(j > 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }

}
