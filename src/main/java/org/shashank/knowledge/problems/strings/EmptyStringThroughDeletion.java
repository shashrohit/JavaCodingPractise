package org.shashank.knowledge.problems.strings;

public class EmptyStringThroughDeletion {

    public static boolean recursiveDeletion(String string, String pattern){
        while(string.length() > 0){
            int index;
            index = string.indexOf(pattern);
            if (index == -1) {
                return false;
            }
            else{
                string = string.substring(0, index) + string.substring(index + pattern.length());
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(recursiveDeletion("GEEGEEKSKS", "GEEKS"));
    }
}
