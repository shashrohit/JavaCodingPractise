package org.shashank.knowledge.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortOneArrayUsingAnother {

    public static int[] sort(int[] arr1, int[] arr2){
        Map<Integer, Integer> freq = new HashMap<>();
        int[] result = new int[arr1.length];
        for (int i : arr1) {
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        int index = 0;
        for (int j : arr2) {
            if (freq.containsKey(j)) {
                for (int k = 0; k < freq.get(j); k ++){
                    result[index++] = j;
                }
            }
            freq.remove(j);
        }

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            for(int l=0; l<entry.getValue(); l++) result[index++] = entry.getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = sort(new int[]{2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 },
                new int[] { 2, 1, 8, 3 });
        Arrays.stream(result).forEach(System.out::println);
    }
}
