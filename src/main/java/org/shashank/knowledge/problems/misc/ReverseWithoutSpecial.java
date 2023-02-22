package org.shashank.knowledge.problems.misc;

public class ReverseWithoutSpecial {

    public static String reverseString(String str){

        char[] charSequence = str.toCharArray();
        int index = -1;
        int n = charSequence.length;
        char temp;
        for(int i=n-1; i>=n/2; i--){
            if(Character.isAlphabetic(charSequence[i])){
                while(true){
                    index += 1;
                    if(Character.isAlphabetic(charSequence[index])){
                        temp = charSequence[i];
                        charSequence[i] = charSequence[index];
                        charSequence[index] = temp;
                        break;
                    }
                }
            }
        }
        return new String(charSequence);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("a!!!b.c.d,e'f,ghi"));
    }
}
