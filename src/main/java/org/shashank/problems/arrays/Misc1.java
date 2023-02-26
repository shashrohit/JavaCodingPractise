package org.shashank.problems.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
Collection interfaces -
T> T[] toArray(T[] a); - Returns an array containing all the elements in this set
                         the type of the returned array is that of the specified array.
Object[] toArray();

Whereas in case of Streams -
set.stream().toArray() -> Object[]
set.stream().toArray(Integer[]::new) -> this does not accept array instead intFunction
 */
public class Misc1 {

    public static void main(String[] args) {
        // ----------------------- reverse -----------------------------------
        int[] arr = {1, 4, 18, 23, 5, 7};
        int n = arr.length;
        int[] result = new int[n];

        int index = 0;
        for(int i=n-1; i >= 0; i--){
            result[index++] = arr[i];
        }
        System.out.println(Arrays.toString(result));

        // ----------------------- Second largest -----------------------------------
        int[] arr1 =  {10, 20, 20, 4, 45, 45, 45, 99, 99};
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length-2]);
        // Duplicate handling
        Set<Integer> set = new HashSet<>();
        for(int i: arr1) set.add(i);

        Integer[] output = set.stream().sorted().toArray(Integer[]::new);
        Arrays.stream(output).forEach(System.out::println);

        // --------------------------------k  largest elements ---------------------
        int k = 3;
        int count=0;
        int lastIndex = output.length-1;
        while(count < k){
            System.out.println(output[lastIndex--]);
            count ++;
        }
    }
}
