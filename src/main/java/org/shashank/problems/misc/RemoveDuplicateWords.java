package org.shashank.problems.misc;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

    public static void removeDuplicateWords(String sentence){
        String[] words = sentence.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(words));
        Map<String, Integer> freq = new HashMap<>();

        for (int i=0; i<list.size();i++) {
            if (freq.containsKey(words[i])) {
                 // Don't use remove as it will decrease the size of list
                list.set(i, "");
            } else {
                freq.put(words[i], 1);
            }
        }
        List<String> outputList = list.stream().filter(a -> !a.equals("")).collect(Collectors.toList());
        String[] output = outputList.toArray(new String[0]);
        System.out.println(Arrays.toString(output));

        // joining collection
        System.out.println(StringUtils.join(outputList, " "));
    }

    public static void main(String[] args) {
        removeDuplicateWords("Python is great and Java is also great");
    }
}
