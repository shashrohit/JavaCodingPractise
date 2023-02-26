package org.shashank.problems.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveElementByIndex {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int index = 1;
        // Create ArrayList from the array
        List<Integer> arrayList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());

        // Remove the specified element
        arrayList.remove(index);

        // return the resultant array
        int[] output = arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(output));
    }
}
