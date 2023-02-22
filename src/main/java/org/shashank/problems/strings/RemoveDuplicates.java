package org.shashank.problems.strings;

import java.util.*;

public class RemoveDuplicates {

    public static String removeDuplicates1(String string){
        // O(n*n)
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> frequency = new HashMap<>();
        for(int i=0; i<string.length(); i++){
            if(!frequency.containsKey(string.charAt(i))){
                frequency.put(string.charAt(i), 1);
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates2(String string){
        // O(n)
        char[] characters = string.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for(char character: characters){
            characterSet.add(character);
        }
        return characterSet.toString();
    }

    public static String removeDuplicates3(String string){
        // O(nlogn)
        char[] characters = string.toCharArray();
        Arrays.sort(characters);
        List<Character> result = new ArrayList<>();
        result.add(characters[0]);
        for(int i=1; i<characters.length; i++){
            if(characters[i] != characters[i-1]){
                result.add(characters[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates1("geeksforgeeks"));
        System.out.println(removeDuplicates2("geeksforgeeks"));
        System.out.println(removeDuplicates3("geeksforgeeks"));
    }
}
