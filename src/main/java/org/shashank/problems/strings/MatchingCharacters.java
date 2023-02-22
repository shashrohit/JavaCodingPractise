package org.shashank.problems.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MatchingCharacters {

    public static List<Character> getMatchingChars1(String string1, String string2){
        List<Character> result = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder(string1);
        StringBuilder sb2 = new StringBuilder(string2);
        for(int i=0; i< sb1.length(); i++){
            int index = sb2.indexOf(String.valueOf(sb1.charAt(i)));
            if(index != -1){
                sb2.deleteCharAt(index);
                result.add(sb1.charAt(i));
            }
        }
        return result;
    }

    // Function to count the matching characters
    static void count(String str1, String str2)
    {
        int c = 0;
        List<Character> result = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++)
        {
            if (str2.indexOf(str1.charAt(i)) >= 0)
            {
                c += 1;
                result.add(str1.charAt(i));
            }
        }
        System.out.println("No. of matching characters are: " + c);
        result.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new HashSet<>(getMatchingChars1("aabbcddekll12@", "bb2211@55k")).forEach(System.out::println);
        count("aabbcddekll12@", "bb2211@55k");
    }
}
