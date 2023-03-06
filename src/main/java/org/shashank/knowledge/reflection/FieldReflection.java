package org.shashank.knowledge.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

/*
public Class<?> getDeclaringClass()
public String getName()
public Class<?> getType()
public Object get(Object obj)
public boolean getBoolean(Object obj)
public void set(Object obj, Object value)
public void setBoolean(Object obj, boolean z)
public int getModifiers()
 */
public class FieldReflection {

    public int a = 10;
    public int b = 10;
    public String name = "Shahsank";

    public static void main(String[] args) throws IllegalAccessException {
        FieldReflection fr = new FieldReflection();

        Field[] fields = FieldReflection.class.getFields();
        Arrays.stream(fields).forEach(System.out::println);

        fields[0].setInt(fr, 20);
        System.out.println(fields[0].getInt(fr));
    }
}
