package org.shashank.problems;

import java.util.ArrayList;
import java.util.List;

public class Leaders {

    public static List<Integer> findLeaders(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        leaders.add(arr[n-1]);
        int leader = leaders.get(0);

        for(int i = n-2; i >= 0; i--){
            if(arr[i] > leader){
                leaders.add(arr[i]);
                leader = arr[i];
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        Leaders.findLeaders(new int[]{16, 17, 4, 3, 5, 2}).forEach(System.out::println);
    }
}
