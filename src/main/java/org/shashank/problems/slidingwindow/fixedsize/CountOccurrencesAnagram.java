package org.shashank.problems.slidingwindow.fixedsize;

import java.util.HashMap;
import java.util.Map;

/*
Given a word pat and a text txt. Return the count of the occurrences of anagrams
of the word in the text.

Example:
Input:
txt = forxxorfxdofr
pattern = for
Output: 3
Explanation: for, orf and ofr
 */
public class CountOccurrencesAnagram {

    private static boolean isAnagram(String str1, String str2){

        Map<Character, Integer> map = new HashMap<>();
        for(char c: str1.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);

        for(char c: str2.toCharArray()) map.put(c, map.getOrDefault(c, 0)-1);

        return map.values().stream().allMatch(x -> x==0);
    }
    public static void countOccurrences(String str, String pattern){

        int size = pattern.length();
        int start = 0, end = 0;
        StringBuilder currentSubString = new StringBuilder();
        while(end < str.length() && start+size <= str.length()){
            currentSubString.append(str.charAt(end));

            if(end-start+1 < size){
                end+=1;
            }
            else if(end-start+1 == size){
                if(isAnagram(currentSubString.toString(), pattern)){
                    System.out.println("Anagram - " + currentSubString + " found between positions "
                    + start + " and "+ end);
                }
                else{
                    System.out.println("No anagram found between positions "
                            + start + " and "+ end);
                }
                currentSubString.deleteCharAt(0);
                start += 1;
                end+=1;
            }
        }
    }

    public static void main(String[] args) {
        countOccurrences("forxxorfxdofr", "for");
    }
}
