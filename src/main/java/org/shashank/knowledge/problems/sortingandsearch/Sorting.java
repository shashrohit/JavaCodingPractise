package org.shashank.knowledge.problems.sortingandsearch;

import java.util.Arrays;

public class Sorting {

    public static int[] bubblesSort(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length - i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        int key, j;
        for(int i=1; i<arr.length; i++){
            key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j -=1;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        int temp, min_idx;
        for(int i=0; i<arr.length; i++){
            min_idx = i;
            for(int j=i; j< arr.length; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubblesSort(new int[]{64, 34, 25, 12, 22, 11, 90})));
        System.out.println(Arrays.toString(insertionSort(new int[]{64, 34, 25, 12, 22, 11, 90})));
        System.out.println(Arrays.toString(selectionSort(new int[]{64, 34, 25, 12, 22, 11, 90})));
    }
}
