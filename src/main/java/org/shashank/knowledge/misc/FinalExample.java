package org.shashank.knowledge.misc;

/*
Final Variables -
A final variable cannot be modified. You must initialize it or Compile error is thrown.
If the final variable is a reference, this means that the variable cannot be re-bound
to reference another object, but the internal state of the object can be changed i.e.
you can add or remove elements from the final array or final collection.
It is good practice to represent final variables in all uppercase, using underscore.

There are three ways to initialize a final variable-
1. You can initialize a final variable when it is declared.
2. A blank final variable can be initialized inside an instance-initializer {}
    block or inside the constructor. It must be initialized in all constructors,
    otherwise, a compile-time error will be thrown.
3. A blank final static variable can be initialized inside a static block.

Final classes -
Uses-
1. To prevent inheritance. All Wrapper Classes like Integer, Float, etc. are final classes.
2. To create an immutable class like the predefined String class. Immutable class in java means
   that once an object is created, we cannot change its content.

Conditions for creating immutable class -
1. The class must be declared as final so that child classes can’t be created.
2. Data members must be declared private so that direct access is not allowed.
3. Data members must be declared as final so that we can’t change the value
   of it after object creation.
4. A parameterized constructor should initialize all the fields.

Final method -
A final method cannot be overridden, throws compile error.
 */

final class Student {
    private final String name;
    private final int regNo;
    public Student(String name, int regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    // Method 1
    public String getName() { return name; }
    // Method 2
    public int getRegNo() { return regNo; }
}

public class FinalExample {

    // Main driver method
    public static void main(String[] args)
    {
        Student s = new Student("ABC", 101);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
    }

}
