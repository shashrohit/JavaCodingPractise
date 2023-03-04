package org.shashank.problems.misc;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

    public static List<Integer> findPeaks(int[] arr){

        List<Integer> peaks = new ArrayList<>();
        int n = arr.length;

        if(arr[0] > arr[1]){
            peaks.add(arr[0]);
        }


        if(arr[n-1] > arr[n-2]){
            peaks.add(arr[n-1]);
        }

        for(int i=1; i<n-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                peaks.add(arr[i]);
            }
        }
        return peaks;
    }

    public static void main(String[] args) {
        findPeaks(new int[]{1, 3, 20, 4, 1, 0, 10, 5}).forEach(System.out::println);
    }
}
