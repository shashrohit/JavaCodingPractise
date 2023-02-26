package org.shashank.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chunks {

    public static List<Integer[]> chunks(int[] arr, int chunkSize){
        List<Integer[]> output = new ArrayList<>();
        Integer[] intermediateArr;
        for(int i =0; i < arr.length; i=i+chunkSize){
            intermediateArr = new Integer[chunkSize];
            for(int j =0; j< chunkSize; j++){
                if(i+j <= arr.length-1) intermediateArr[j] = arr[i+j];
            }
            output.add(intermediateArr);
        }

        List<Integer> list;
        // remove null
        for(int i=0; i<output.size(); i++){
            list = new ArrayList<>(Arrays.asList(output.get(i)));
            list.remove(null);
            output.set(i, list.toArray(new Integer[0]));
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
