package org.shashank.problems.misc;

public class LongestPalindrome {

    public static String longestPalindrome(String str){

        String subString = "", revSubString = "", longestPalindrome = "";
        int j=0;
        int n = str.length();

        for(int i=0; i< n; i++){
            j = n-1;
            while(i < j){
                if(str.charAt(i) == str.charAt(i) && longestPalindrome.length() < j-i+1){
                    subString = str.substring(i, j+1);
                }
                revSubString = new StringBuilder(subString).reverse().toString();;
                if(subString.equals(revSubString)){
                    longestPalindrome = subString;
                }
                j-=1;
            }
        }

        if(longestPalindrome.equals("")){
            longestPalindrome = str.substring(0, 1);
        }
        return longestPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("forgeeksskeegfor"));
    }
}
