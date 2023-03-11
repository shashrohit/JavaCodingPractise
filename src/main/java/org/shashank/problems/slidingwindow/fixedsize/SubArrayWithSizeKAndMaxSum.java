package org.shashank.problems.slidingwindow.fixedsize;

/*

Given an array of integers Arr of size N and a number K.
Return the maximum sum of a sub array of size K.

Input:
K = 2
Arr = [100, 200, 300, 400]
Output:
700

Explanation:
Arr3  + Arr4 =700
which is maximum.
 */
public class SubArrayWithSizeKAndMaxSum {
    private static int maxSumSubArray(int[] arr, int size){

        int start=0, end=0, max_sum=Integer.MIN_VALUE, current_max=0;
        while(end < arr.length){
            current_max += arr[end];
            if(end-start+1 < size){ // condition for creating right size window
               end +=1;             // for the first time
            }
            else if(end-start+1 == size){
                max_sum = Math.max(max_sum, current_max);
                current_max -= arr[start];
                start += 1;
                end +=1;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        System.out.println(maxSumSubArray(new int[]{100, 200, 300, 400}, 2));
        System.out.println(maxSumSubArray(new int[]{100, 200, 300, 400, -200}, 3));
    }
}




