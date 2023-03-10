package org.shashank.problems.slidingwindow.fixedsize;

import java.util.ArrayList;
import java.util.List;
/*
Given an array and a positive integer k, find the first negative integer
for each and every sub array of size k.

Input:
K= 2
-8 2 3 -6 10
Output:
-8 0 -6 -6
 */
public class FirstNegativeInEachSubArrayFixedSize {

    public static void firstNegativeBrute(int[] arr, int size){
        boolean flag;

        for(int i =0; i< arr.length; i++){
            flag = false;
            if(i+size > arr.length) break;
            for(int j=0; j<size; j++){
                if(arr[i+j] < 0){
                    System.out.println("The negative no. in sub array ranging" +
                            "  from "+ i + " to " + (i+size-1) + " is " +
                            arr[i+j]);
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println("The first negative no. in sub array ranging" +
                    "  from "+ i + " to " + (i+size-1) + " is 0");
        }
    }

    public static void firstNegativeSlidingWindow(int[] arr, int size){

        int start = 0; int end = 0;
        List<Integer> numbers = new ArrayList<>();

        while(end < arr.length && start + size <= arr.length){
            if(arr[end] < 0) numbers.add(arr[end]);

            if(end-start+1 < size){
                end +=1;
            }
            else if(end-start+1 == size){
                if(numbers.size()>0) {
                    System.out.println("The first negative no. in sub array ranging" +
                            "  from "+ start + " to " + end + " is " +
                            numbers.get(0));
                }
                else{
                    System.out.println("The first negative no. in sub array ranging" +
                            "  from "+ start + " to " + end + " is 0");
                }
                if(numbers.contains(arr[start]))
                    numbers.remove(0);
                start +=1;
                end+=1;
            }
        }
    }


    public static void main(String[] args) {
        firstNegativeBrute(new int[]{-8, 2, 3, -6, 10}, 2);
        System.out.println("Optimized algorithm");
        firstNegativeSlidingWindow(new int[]{-8, 2, 3, -6, 10}, 2);

    }
}
