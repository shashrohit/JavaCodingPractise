package org.shashank.knowledge.problems.strings;

import java.util.HashMap;
import java.util.Map;

// Arrays.sort has Time Complexity -> O(nlogn)
public class Anagrams {

    // O(n)
    public static boolean areAnagrams(String str1, String str2){

        Map<Character, Integer> frequency = new HashMap<>();
        char[] charSequence1 = str1.toCharArray();
        char[] charSequence2 = str2.toCharArray();

        if(str1.length() != str2.length()) return false;

        for(char c: charSequence1){
            if(frequency.containsKey(c)){
                frequency.put(c, frequency.get(c)+1);
            }else{
                frequency.put(c, 1);
            }
        }

        for(char c: charSequence2){
            if(frequency.containsKey(c)){
                frequency.put(c, frequency.get(c)-1);
            }else{
                return false;
            }
        }

        for(Map.Entry<Character, Integer> entry: frequency.entrySet()){
            if(entry.getKey()!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("geeksforgeeks", "forgeeksgeeks"));
    }

}
