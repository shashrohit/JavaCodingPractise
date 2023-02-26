package org.shashank.problems.misc;

public class SumNumbersOfString {

    public static long sum(String str){

        long sum = 0;
        String currentTotal = "";
        char c;
        for(int i=0; i< str.length(); i++){
            c = str.charAt(i);
            if(!Character.isAlphabetic(c)){
                currentTotal += c;
            }
            else if(!currentTotal.equals("")){
                sum += Long.parseLong(currentTotal);
                currentTotal = "";
            }
        }
        if(!currentTotal.equals("")) sum += Long.parseLong(currentTotal);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum("12abc20yz68"));
    }
}
