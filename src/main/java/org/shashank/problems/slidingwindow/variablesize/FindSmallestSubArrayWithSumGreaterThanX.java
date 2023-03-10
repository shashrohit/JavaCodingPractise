package org.shashank.problems.slidingwindow.variablesize;

public class FindSmallestSubArrayWithSumGreaterThanX {

    public static int findSmallestSubArray(int[] arr, int sum){

        int start = 0;
        int end = 0;
        int currentSum = 0;
        int smallestSubArray = Integer.MAX_VALUE;

        while(end < arr.length){
            currentSum += arr[end];
            if(currentSum < sum){
                end += 1;
            }
            else{
                while(currentSum >= sum){
                    if(smallestSubArray > end-start+1){
                        smallestSubArray = end-start+1;
                    }
                    currentSum -= arr[start];
                    start += 1;
                }
                end += 1;
            }
        }
        return smallestSubArray;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 10, 1, 3};
        System.out.println(findSmallestSubArray(arr, 12));
    }
}
