package org.shashank.knowledge.reflection;
import java.lang.reflect.Array;

import java.util.Arrays;

/*
public static native int getLength(Object array)
public static native Object get(Object array, int index)
public static native boolean getBoolean(Object array, int index)
public static native void set(Object array, int index, Object value)
 */

public class ArrayReflection {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(Array.getInt(arr, 3));

        Array.setInt(arr, 3, 4);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
