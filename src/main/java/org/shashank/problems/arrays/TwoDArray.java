package org.shashank.problems.arrays;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {2,3,4, 5, 6},
                {2,5,10, 45},
                {10, 20, 40}
        };

        for(int i=0; i <arr.length; i++){
            for(int j=0; j<arr[i].length; j++) System.out.println(arr[i][j]);
        }

        for(int i=0; i <2; i++){
            for(int j=0; j<2; j++) System.out.println(arr[i][j]);
        }
    }
}
