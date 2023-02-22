package org.shashank.knowledge.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Misc2 {
    public static void main(String[] args) {
        //----------------------- print even numbers in a list -----------------
        int[] numbers = {10, 21, 4, 45, 66, 93, 93};
        Arrays.stream(numbers).filter(a -> a%2 == 0).forEach(System.out::println);

        // -------------- count the number of occurrences and print duplicate nos --------------
        Map<Integer, Integer> freq = new HashMap<>();
        for(int number: numbers) freq.put(number, freq.getOrDefault(number, 0)+1);

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() > 1) System.out.println(entry.getKey());
        }

        // --------------------- Sum of number digits in List-----------------------
        String numberString;
        char[] charSequence;
        int total = 0;
        int[] result = new int[numbers.length];

        for(int i=0; i<numbers.length; i++){
            numberString = String.valueOf(numbers[i]);
            charSequence = numberString.toCharArray();
            for(char c: charSequence) total += Integer.parseInt(String.valueOf(c));
            result[i] = total;
            total = 0;
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
