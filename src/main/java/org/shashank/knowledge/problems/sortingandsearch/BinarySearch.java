package org.shashank.knowledge.problems.sortingandsearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int low, int high, int key){
        if(low<high){
            int mid = (high+low)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key < arr[mid]){
                return binarySearch(arr, low, mid-1, key);
            }else{
                return binarySearch(arr, mid+1, high, key);
            }
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 10, 40};
        System.out.println(binarySearch(arr, 0, arr.length-1, 10));
        System.out.println(binarySearch(arr, 0, arr.length-1, 11));
    }
}
