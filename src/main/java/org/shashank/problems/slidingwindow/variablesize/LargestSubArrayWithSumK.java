package org.shashank.problems.slidingwindow.variablesize;

import java.util.ArrayList;
import java.util.List;

public class LargestSubArrayWithSumK {

    public static void findLargestSubArray(int[] arr, int sum){

        int start = 0, end=0, currentSum=0;
        int largestSubArraySize = 0;

        while(end<arr.length){

            currentSum += arr[end];
            if(currentSum < sum){
                end +=1;
            }
            else if(currentSum == sum){
                largestSubArraySize = end-start+1;
                end += 1;
            }else{
                while(currentSum > sum){
                    currentSum -= arr[start];
                    start +=1;
                }
                end +=1;
            }
        }
        System.out.println(largestSubArraySize);
    }

    public static void main(String[] args) {
        findLargestSubArray(new int[]{4, 1, 1, -1, 2, 3, 5}, 3);
    }
}
