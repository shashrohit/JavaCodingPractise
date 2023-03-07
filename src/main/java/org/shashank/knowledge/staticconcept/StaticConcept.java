package org.shashank.knowledge.staticconcept;

/*
Static Methods rules -
The static methods of a particular class can only access the static variables
and can change them.
A static method can only call other static methods.
Static methods can’t refer to non-static variables or methods.
Static methods can’t refer to “super” or “this” members.
Non-static methods can access both static and non-static members of a class.
 */
public class StaticConcept {

     static int counter=0;

     StaticConcept(){
         counter++;
     }

     public void m1(){

     }

    public static void main(String[] args) {
        StaticConcept sc1 = new StaticConcept();
        StaticConcept sc2 = new StaticConcept();
        System.out.println(sc1.counter);
        System.out.println(sc2.counter);
        System.out.println(StaticConcept.counter);

    }

}
