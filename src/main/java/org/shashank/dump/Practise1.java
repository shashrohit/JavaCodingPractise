package org.shashank.dump;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Practise1 {

    public static void maxInAllSubArrays(int[] arr, int size){

        int start = 0, end = 0, n=arr.length;
        int currentMax = Integer.MIN_VALUE;
        Deque<Integer> deque = new ArrayDeque<>();

        while(end<n){
            deque.addFirst(arr[end]);

            if(currentMax< arr[end]) currentMax = arr[end];
            if(end-start+1<size){
                end+=1;
            }else if(end-start+1 == size){
                System.out.println(currentMax);
                if(deque.getLast() == arr[start]){
                    deque.removeLast();
                    if(!deque.isEmpty())
                        currentMax = deque.stream()
                            .max(Integer::compareTo).get();
                }
                start +=1;
                end+=1;
            }
        }

    }


    public static void main(String[] args) {

//        System.out.println(findSubArray(new int[]{100, 200, 300, 400}, 2));
//        System.out.println(findSubArray(new int[]{100, 200, 300, 400, -200}, 3));

//        firstNegativeSlidingWindow(new int[]{-8, 2, 3, -6, 10}, 3);
//        System.out.println(countOccurrences("forxxorfxdofr", "for"));
        maxInAllSubArrays(new int[]{4, 3, -1, -3, 5}, 3);
    }
}
