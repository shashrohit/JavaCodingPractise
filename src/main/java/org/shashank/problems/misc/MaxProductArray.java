package org.shashank.problems.misc;

public class MaxProductArray {

    public static int maxProduct(int[] arr) {

        int pos_a = 0, pos_b = 0, neg_a = 0, neg_b = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > pos_a) {
                pos_b = pos_a;
                pos_a = arr[i];
            } else if (arr[i] > pos_b) {
                pos_b = arr[i];
            }

            if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(neg_a)) {
                neg_b = neg_a;
                neg_a = arr[i];
            } else if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(neg_b)) {
                neg_b = arr[i];
            }
        }
        return Math.max((pos_a*pos_b), (neg_b*neg_a));
    }

    public static void main(String[] args) {
        System.out.println(MaxProductArray.maxProduct(new int[]{1, 4, 3, -6, 7, -10}));
    }
}
