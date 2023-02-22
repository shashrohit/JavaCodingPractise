package org.shashank.knowledge.problems.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MinMaxFrequency {

    public static List<Character> getMinFrequency(String string){
        Map<Character, Integer> frequency = new HashMap<>();
        char[] letters = string.toCharArray();
        for(char letter: letters){
            frequency.put(letter, frequency.getOrDefault(letter, 0)+1);
        }

        List<Character> result = new ArrayList<>();

        int minFrequency = frequency.values().stream().min(Integer::compareTo).get();
//        for(Map.Entry<Character, Integer> entry: frequency.entrySet()){
//            if(entry.getValue() == minFrequency){
//                result.add(entry.getKey());
//            }
//        }
        // OR
        result = frequency.entrySet().stream()
                .filter(a -> a.getValue() == minFrequency)
                .map(a -> a.getKey())
                .collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        getMinFrequency("GeeksforGeeks").forEach(System.out::println);
    }
}
