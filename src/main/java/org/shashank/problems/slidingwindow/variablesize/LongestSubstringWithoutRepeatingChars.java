package org.shashank.problems.slidingwindow.variablesize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {

    public static String longestSubString1(String str){

        int start = 0, end = 0;
        Map<Character, Integer> map = new HashMap<>();
        char c;
        String longestString = "";
        while(end<str.length()){
            c = str.charAt(end);
            if(map.containsKey(c)){
                start = Math.max(map.get(c)+1, start);
            }
            if(longestString.length() < end-start+1){
                longestString = str.substring(start, end+1);
            }
            map.put(c, end);
            end += 1;
        }
        return longestString;
    }

    public static String longestSubString2(String str){
        int start = 0, end = 0;
        String longest = "";
        Map<Character,Integer> map = new HashMap<>();
        char c;

        while(end < str.length()){
            c = str.charAt(end);
            map.put(c, map.getOrDefault(c, 0)+1);

            if(map.size() < end-start+1){
                while(map.size() < end-start+1){ // Map size can never be greater
                    char x = str.charAt(start); // than window and less means repetition
                    map.put(x, map.get(x)-1);
                    if(map.get(x)==0) map.remove(x);
                    start +=1;
                }
                end+=1;
            }else if(map.size() == end-start+1){
                if(longest.length() < end-start+1){
                    longest = str.substring(start, end+1);
                }
                end+=1;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestSubString1("aabacbebebe"));
        System.out.println(longestSubString2("aabacbebebe"));
    }
}
