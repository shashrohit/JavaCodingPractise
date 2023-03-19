package org.shashank.problems.slidingwindow.fixedsize;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
Given an array arr[] of size N and an integer K. Find the maximum for each and every
sub array of size K.

Example:
Input 1:
    A = [1, 3, -1, -3, 5, 3, 6, 7]
    K = 3
Output 1:
    C = [3, 3, 5, 5, 6, 7] .
 */
public class MaxOfEachSubArrayOfSizeK {

    public static void maxInAllSubArraysWrong(int[] arr, int size){

        int start = 0, end = 0;
        int currentMax = Integer.MIN_VALUE;
        while(end< arr.length){
            if(currentMax < arr[end])
                currentMax = arr[end];
            if(end-start+1 == size){
                System.out.println(currentMax);
                if(currentMax == arr[start]) currentMax = Integer.MIN_VALUE;
                start+=1;
            }
            end+=1;
        }
    }

    public static void maxInAllSubArrays(int[] arr, int size){
        Deque<Integer> deque = new ArrayDeque<>();
        int start = 0, end = 0;
        int currentMax = Integer.MIN_VALUE;
        while(end< arr.length){
            deque.addFirst(arr[end]);
            if(currentMax < arr[end])
                currentMax = arr[end];

            if(end-start+1 < size){
                end +=1;
            }
            else if(end-start+1 == size){
                System.out.println(currentMax);
                if(deque.getLast() == currentMax) {
                    deque.removeLast();
                    if(!deque.isEmpty())
                        currentMax = deque.stream().max(Integer::compareTo).get();
                }
                start+=1;
                end+=1;
            }
        }
    }

    public static void main(String[] args) {
//        maxInAllSubArraysWrong(new int[]{4, 3, -1, -3, 5}, 3);
        System.out.println("Correct answer - ");
        maxInAllSubArrays(new int[]{4, 3, -1, -3, 5}, 3);

    }
}
