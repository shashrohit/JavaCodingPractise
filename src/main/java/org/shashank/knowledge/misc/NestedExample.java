package org.shashank.knowledge.misc;

/*
The scope of a nested class is bounded by the scope of its enclosing class.
NestedClass does not exist independently of class OuterClass.

A nested class has access to the members, including private members, of the outer class.
But the enclosing class does not have access to the members of the nested class.

A nested class is also a member of its enclosing class.
A nested class can be declared private, public, protected, or package private(default).

Types of Nested classes -
1. static nested class
2. inner class - local and anonymous classes

Normal/Regular inner class	Vs Static nested class
1.	Without an outer class object existing, there cannot be an inner class object.
That is, the inner class object is always associated with the outer class object.
But without an outer class object existing, there may be a static nested class object.
2.	Inside normal/regular inner class, static members can’t be declared.
Inside static nested class, static members can be declared.
4.	Inside normal/regular inner class, Both static and non-static members of outer class
can be accessed directly. Inside static nested class, only a static member of outer class
can be accessed directly.

 */

class OuterClass
{
    // static member
    static int outer_x = 10;
    // instance(non-static) member
    int outer_y = 20;
    // private member
    private static final int outer_private = 30;
    static class StaticNestedClass
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);
            // The following statement will give compilation error
            // System.out.println("outer_y = " + outer_y);
        }
    }
}

// outer class
class OuterClass2
{
    // static member
    static int outer_x = 10;
    // instance(non-static) member
    int outer_y = 20;
    // private member
    private int outer_private = 30;

    // inner class
    class InnerClass2
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
            // can also access non-static member of outer class
            System.out.println("outer_y = " + outer_y);
            // can also access a private member of the outer class
            System.out.println("outer_private = " + outer_private);
        }
    }
}

public class NestedExample {

    public static void main(String[] args)
    {
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();

        // accessing an inner class
        OuterClass2 outerObject2 = new OuterClass2();
        OuterClass2.InnerClass2 innerObject = outerObject2.new InnerClass2();

        innerObject.display();
    }

}
