package org.shashank.knowledge.problems.misc;

public class oneStringSubsetOfAnother {
    public static boolean isSubset(String str1, String str2){
        for(char c: str1.toCharArray()){
            if(str2.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubset("ABHISHEKsinGH", "gfhfBHkooIHnfndSHEKsiAnG"));
    }
}
