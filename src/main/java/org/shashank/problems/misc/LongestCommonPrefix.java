package org.shashank.problems.misc;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String firstString = arr[0];
        String lastString = arr[arr.length-1];

        String longestPrefix = "";
        int i = 0;
        int n = arr[0].length();
        while(i<n)
        {
            if(firstString.charAt(i) == lastString.charAt(i))
            {
                longestPrefix += firstString.charAt(i);
            }else{
                break;
            }
            i+=1;
        }
        return longestPrefix;
    }
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"}));
    }
}
