package org.shashank.problems.sortingandsearch;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr){

        if(arr.length > 1){
            int mid = arr.length/2;

            int[] left = new int[mid];
            int[] right = new int[arr.length-mid];

            for(int i=0; i<mid; i++){
                left[i] = arr[i];
            }

            for(int j=0; j<arr.length-mid; j++){
                right[j] = arr[mid+j];
            }

            merge(left);
            merge(right);

            int i =0, j = 0, k = 0;

            while(i < left.length && j< right.length){
                if(left[i] < right[j]){
                    arr[k] = left[i];
                    i+=1;
                }else{
                    arr[k] = right[j];
                    j+=1;
                }
                k += 1;
            }

            while(i < left.length){
                    arr[k] = left[i];
                    i+=1;
                    k+=1;
                }
            while(j< right.length){
                arr[k] = right[j];
                j+=1;
                k+=1;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        merge(arr);
        System.out.println(Arrays.toString(arr));
    }
}
