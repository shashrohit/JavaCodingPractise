package org.shashank.problems.slidingwindow.variablesize;

import java.util.*;

/*
Given a string you need to print the size of the longest possible substring
that has exactly K unique characters.
If there is no possible substring then print -1.

Example 1:
Input:
S = "aabacbebebe", K = 3
Output: 7
Explanation: "cbebebe" is the longest
substring with K distinct characters.
 */
public class LongestSubstringWithExactlyKUniqueChars {

    public static String findSubstring(String str, int size){

        int end = 0, start = 0;
        String longestSubstring = "";
        Map<Character, Integer> uniqueChars = new HashMap<>();
        char c;
        while(end < str.length()){
            c = str.charAt(end);
            uniqueChars.put(c, uniqueChars.getOrDefault(c, 0)+1);
            if(uniqueChars.size() < size){
                end += 1;
            }
            else if(uniqueChars.size() == size){
                if(longestSubstring.length() < end-start+1){
                    longestSubstring = str.substring(start, end+1);
                }
                end += 1;
            }else{
                while(uniqueChars.size()>size){
                    char x = str.charAt(start);
                    uniqueChars.put(x, uniqueChars.get(x)-1);
                    if(uniqueChars.get(x) == 0){
                        uniqueChars.remove(x);
                    }
                    start += 1;
                }
                end += 1;
            }
        }
        return longestSubstring;
    }


    public static void main(String[] args) {
        System.out.println(findSubstring("aabacbebebe", 3));
    }


}
