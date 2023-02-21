package org.shashank.problems.misc;

public class SumNumbersOfString {

    public static int sum(String str){
        int sum = 0;
        String cur_total = "";
        char[] charSequence = str.toCharArray();

        for (char c : charSequence) {
            if (Character.isDigit(c)) {
                cur_total += c;
            } else if (!cur_total.equals("")) {
                sum += Integer.parseInt(cur_total);
                cur_total = "";
            }
        }
        sum += Integer.parseInt(cur_total);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum("12abc20yz68"));
    }
}
