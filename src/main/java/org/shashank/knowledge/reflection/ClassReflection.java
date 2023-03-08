package org.shashank.knowledge.reflection;

import java.lang.reflect.Method;

/*
Method[] getMethods() - only public
Method[] getDeclaredMethods() - all
Method getMethod(String name)
Method getDeclaredMethod(String name)
Field[] getFields()
Field[] getDeclaredFields()
Field getField(String name)
Constructor[] getConstructors()
Constructor[] getDeclaredConstructor()
Annotation[] getAnnotations()
 */
public class ClassReflection {

    public static void main(String[] args) {
        Method[] methods = ClassReflection.class.getMethods();
    }
}
