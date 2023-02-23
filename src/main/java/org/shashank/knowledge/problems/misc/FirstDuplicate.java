package org.shashank.knowledge.problems.misc;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {

    public static int findFirstDuplicate(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstDuplicate.findFirstDuplicate(new int[]{1, 2, 4, 4, 1, 3, 7, 5, 5, 2}));
    }

}