package org.shashank.knowledge.reflection;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
public Class<?> getDeclaringClass()
public String getName()
public Class<?> getReturnType()
public Class<?>[] getParameterTypes()
public int getParameterCount()
public Class<?>[] getExceptionTypes()
public Object invoke(Object obj, Object... args)
public <T extends Annotation> T getAnnotation(Class<T> annotationClass)
public Annotation[] getDeclaredAnnotations()
public int getModifiers()
*/

public class MethodReflection {

    public boolean method1(){
        return false;
    }

    public int method2(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Method[] methods = MethodReflection.class.getMethods();
        Arrays.stream(methods).forEach(System.out::println);

        Class cls1 = methods[0].getDeclaringClass();
        Class cls2 = methods[0].getReturnType();
       Annotation[] annotations = methods[0].getDeclaredAnnotations();

       Arrays.stream(annotations).forEach(System.out::println);
    }
}

