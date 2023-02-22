package org.shashank.knowledge.problems.misc;

import java.util.*;

public class PrintAnagramsTogether {

    public static void printAnagrams(String[] words){
        Map<String, List<String>> result = new HashMap<>();
        char[] charSequence;
        String sortedWord;
        for(String word: words){
            charSequence = word.toCharArray();
            Arrays.sort(charSequence);
            sortedWord = new String(charSequence);
            if(!result.containsKey(sortedWord)){
                result.put(sortedWord, new ArrayList<>());
            }
            result.get(sortedWord).add(word);
        }
        result.values().forEach(System.out::println);
    }

    public static void main(String[] args) {
        String[] words = {"cat", "dog", "tac", "god", "act"};
        printAnagrams(words);
    }
}
