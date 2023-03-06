package org.shashank.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chunks {

    public static List<Integer[]> chunks(int[] arr, int chunkSize){
        List<Integer[]> output = new ArrayList<>();
        int k;
        Integer[] intermediateArr;
        for(int i =0; i < arr.length; i=i+chunkSize){
            if(i+chunkSize < arr.length){
                intermediateArr = new Integer[chunkSize];
                k = chunkSize;
            }
            else{
                intermediateArr = new Integer[arr.length-i];
                k = arr.length-i;
            }
            for(int j =0; j< k; j++){
                intermediateArr[j] = arr[i+j];
            }
            output.add(intermediateArr);
        }
        return output;
    }

    public static void main(String[] args) {

        // ------------Break a list into chunks of size N ---------------

        int[] arr = {10, 20, 30, 40, 50};
        List<Integer[]> output = chunks(arr, 3);

        for(Integer[] outputArr: output) System.out.println(Arrays.toString(outputArr));
    }
}
