package org.shashank.problems.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {

    public static int[] merge1(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;

        while(i < n){
            result[k] = arr1[i];
            i += 1;
            k += 1;
        }

        while(j < m){
            result[k] = arr2[j];
            j += 1;
            k += 1;
        }
        Arrays.sort(result);
        return result;
    }

    public static Integer[] merge2(int[] arr1, int[] arr2){
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while(i < arr1.length && j <arr2.length){
            if(arr1[i] < arr2[j]){
                result.add(arr1[i]);
                i +=1;
            }else{
                result.add(arr2[j]);
                j +=1;
            }
        }
        while(i < arr1.length){
            result.add(arr1[i]);
            i +=1;
        }

        while(j < arr2.length){
            result.add(arr2[j]);
            j +=1;
        }
        return result.toArray(new Integer[0]); // Array can be created of type of collection
    }

    public static void main(String[] args) {
        // Approach 1 -> concatenate two arrays then sort it
        // Approach 2 -> sort two arrays and then use merge sort way to merge them
        int[] arr1 = new int[]{5, 4, 15};
        int[] arr2 = new int[]{3, 2, 12, 20};

        // Approach 1
        Arrays.stream(merge1(arr1, arr2)).forEach(System.out::println);

        // Approach 2
        int[] arr3 = new int[]{5, 4, 15};
        int[] arr4 = new int[]{3, 2, 12, 20};
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        Integer[] result = merge2(arr3, arr4);
        Arrays.stream(result).forEach(System.out::println);
    }
}
