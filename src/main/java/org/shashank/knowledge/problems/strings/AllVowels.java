package org.shashank.knowledge.problems.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllVowels {

    public static boolean hasAllVowels(String string){
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> foundVowels = new HashSet<>();
        char[] characters = string.toCharArray();
        for(char character: characters){
            if(vowels.contains(character)){
                foundVowels.add(character);
            }
        }
        return foundVowels.size() == 5;
    }

    public static void main(String[] args) {
        System.out.println(hasAllVowels("aeifndskncsdou"));
    }
}

