package org.shashank.knowledge.problems.misc;

import java.util.StringJoiner;

public class ReverseWords {

    private static String reverseWord(String word){
        String rev = "";
        for(int j=word.length()-1; j>=0; j--){
            rev += word.charAt(j);
        }
        return rev;
    }
    public static String reverseWords(String sentence){
        String[] words = sentence.split(" ");

        for(int i=0; i< words.length; i++){
            words[i] = ReverseWords.reverseWord(words[i]);
        }


        StringJoiner joiner = new StringJoiner(" ");
        for(String word: words) joiner.add(word);
        return joiner.toString();

//        StringBuilder sb = new StringBuilder();
//        Arrays.stream(words).forEach(word -> sb.append(word).append(" "));
//        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseWords.reverseWords("This is sample text"));
    }
}
