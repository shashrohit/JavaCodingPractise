package org.shashank.knowledge.reflection;
import lombok.NonNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/*
public Class<T> getDeclaringClass()
public String getName()
public Parameter[] getParameters()
public Class<?>[] getParameterTypes()
public int getParameterCount()
public Class<?>[] getExceptionTypes()
public <T extends Annotation> T getAnnotation(Class<T> annotationClass)
public Annotation[] getDeclaredAnnotations()
public Annotation[][] getParameterAnnotations()
 */

public class ConstructorReflection {
    int a;
    int b;

    public ConstructorReflection(@NonNull int a, int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        Constructor[] constructors = ConstructorReflection.class.getConstructors();

        Annotation[] annotations = constructors[0].getAnnotations();
        Parameter[] parameters = constructors[0].getParameters();
        Class[] exceptionTypes = constructors[0].getExceptionTypes();

        Arrays.stream(constructors).forEach(System.out::println);
        Arrays.stream(annotations).forEach(System.out::println);
        Arrays.stream(parameters).forEach(System.out::println);
        Arrays.stream(exceptionTypes).forEach(System.out::println);

    }


}
