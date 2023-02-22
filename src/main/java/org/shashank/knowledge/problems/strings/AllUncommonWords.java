package org.shashank.knowledge.problems.strings;

import java.util.*;

public class AllUncommonWords {

    public static String[] getUncommonWords(String sentence1, String sentence2){
        String[] wordsA = sentence1.split(" ");
        String[] wordsB = sentence2.split(" ");
        Map<String, Integer> freq = new HashMap<>();
        List<String> result = new ArrayList<>();

        for(String word: wordsA){
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }
        for(String word: wordsB){
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }

        for(Map.Entry<String, Integer> entry: freq.entrySet()){
            if(entry.getValue() == 1){
                result.add(entry.getKey());
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = getUncommonWords("Geeks for Geeks", "Learning from Geeks for Geeks");
        for(String word: words){
            System.out.println(word);
        }
        //OR
        Arrays.stream(words).forEach(System.out::println);
    }
}
