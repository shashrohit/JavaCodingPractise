package org.shashank.problems.misc;

// Time - O(max(L1, L2)
// Space - O(max(L1, L2)

public class AddBinaryStrings {
    public static String lpad(String str, String lpadCharacter, int length){
        int n = str.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < length-n; i++){
            sb.append(lpadCharacter);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String addBinaryStrings(String s1, String s2){
        int max = Math.max(s1.length(), s2.length());
        String paddedString1 = AddBinaryStrings.lpad(s1, "0", max);
        String paddedString2 = AddBinaryStrings.lpad(s2, "0", max);

        int carry = 0;
        int r;
        String result = "";
        for(int i=max-1; i>=0; i--){
            r = carry;
            r += paddedString1.charAt(i) == '1' ? 1 : 0;
            r += paddedString2.charAt(i) == '1' ? 1 : 0;
            result = (r % 2 == 1) ? "1" : "0" + result;
            carry = (r % 2 == 0) ? 1 : 0;
        }

        if(carry>0){
            result = "1" + result;
        }
        return result;
    }

    public static void main(String[] args) {

        // binary strings
        String s1 = "11";
        String s2 = "1";

        System.out.println(AddBinaryStrings.addBinaryStrings(s1, s2));
    }
}
