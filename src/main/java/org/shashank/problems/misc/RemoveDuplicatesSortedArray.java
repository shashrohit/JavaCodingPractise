package org.shashank.problems.misc;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int index = 1;
        for(int i=0; i<n-1; i++){
            if(nums[i] != nums[i+1]){
                nums[index] = nums[i+1];
                index+=1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        Arrays.stream(nums).forEach(System.out::println);
    }
}
