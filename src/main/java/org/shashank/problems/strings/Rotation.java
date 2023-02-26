package org.shashank.problems.strings;

public class Rotation {

    public static void main(String[] args) {
        // Left rotate
        String str1 = "GeeksforGeeks";
        int d = 2;
        //O(n)
        System.out.println(str1.substring(d) + str1.substring(0, d));

        int n = str1.length();
        // Right rotate
        System.out.println(str1.substring(n-d) + str1.substring(0, n-d));
    }

}
