package org.shashank.problems;

public class NearestPalindrome {

    public static boolean isPalindrome(String str){
        String rev = "";
        for(int i = str.length()-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev.equals(str);
    }

    public static Integer findNearestPalindrome(int number){

        int left = number-1;
        int right = number+1;

        while(!isPalindrome(String.valueOf(left))){
            left -= 1;
        }

        while(!isPalindrome(String.valueOf(right))){
            right += 1;
        }

        return Math.abs(left-number) < Math.abs(right-number) ? left: right;
    }

    public static void main(String[] args) {
        System.out.println(NearestPalindrome.findNearestPalindrome(123456));
    }
}
