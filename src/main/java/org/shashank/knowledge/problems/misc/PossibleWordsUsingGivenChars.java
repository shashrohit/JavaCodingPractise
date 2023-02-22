package org.shashank.knowledge.problems.misc;

import java.util.ArrayList;
import java.util.List;

public class PossibleWordsUsingGivenChars {

    public static List<String> possibleWords(String[] words, char[] chars){
        boolean flag;
        List<String> output = new ArrayList<>();
        for(String word: words){
            flag = true;
            for(char c: word.toCharArray()){
                if(String.valueOf(chars).indexOf(c) == -1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                output.add(word);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] words = {"goo", "bat", "me", "eat", "goal", "boy", "run"};
        char[] chars = {'e', 'o', 'b', 'a', 'm', 'g', 'l'};
        possibleWords(words, chars).forEach(System.out::println);
    }

}
