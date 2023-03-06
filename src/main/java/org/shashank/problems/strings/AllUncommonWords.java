package org.shashank.problems.strings;

import java.util.*;

public class AllUncommonWords {

    public static String[] getUncommonWords(String sentence1, String sentence2){
        String[] wordsA = sentence1.split(" ");
        String[] wordsB = sentence2.split(" ");

        Set<String> setA = new HashSet<>(Arrays.asList(wordsA));
        Set<String> setB = new HashSet<>(Arrays.asList(wordsB));

        Map<String, Integer> freq = new HashMap<>();
        List<String> result = new ArrayList<>();

        for(String word: setA) freq.put(word, freq.getOrDefault(word, 0)+1);
        for(String word: setB) freq.put(word, freq.getOrDefault(word, 0)+1);

        for(Map.Entry<String, Integer> entry: freq.entrySet()){
            if(entry.getValue() == 1){
                result.add(entry.getKey());
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = getUncommonWords("Geeks for Geeks hello hello", "Learning from Geeks for Geeks");
        Arrays.stream(words).forEach(System.out::println);
    }
}
