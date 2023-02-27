package org.shashank.knowledge.misc;

enum Color{
    RED,
    BLUE,
    GREEN
}
public class EnumsExample {

    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println(c1.name());

        Color[] arr = Color.values();

        for(Color col: arr) {
            System.out.println(col + " at index " + col.ordinal());
        }

        Color c2 = Color.valueOf("BLUE");
        System.out.println(c2.name());
    }
}
