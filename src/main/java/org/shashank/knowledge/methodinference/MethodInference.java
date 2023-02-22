package org.shashank.knowledge.methodinference;

/*
A method reference is the shorthand syntax for a lambda expression
that contains just one method call.

Type 1: Reference to a static method
If a lambda expression just call a static method of a class -
(args) -> Class.staticMethod(args)
Then -
Class::staticMethod

Type 2: Reference to an instance method of a particular object
If a lambda expression just call a default method of an object
(args) -> obj.instanceMethod(args)
Then -
obj::instanceMethod

Type 3: Reference to an instance method of an arbitrary object of a particular type
If a lambda expression just call an instance method of a  ObjectType
(obj, args) -> obj.instanceMethod(args)
Then -
ObjectType::instanceMethod

Type 4: Constructor method reference
If a lambda expression just create an object
(args) -> new ClassName(args)

Then -
ClassName::new
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {

    // Attributes of a person
    private String name;
    private Integer age;

    // Constructor
    public Person(String name, int age)
    {
        // This keyword refers to current object itself
        this.name = name;
        this.age = age;
    }

    // Getter-setter methods
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

// Class 2
// Helper class
// Comparator class
class ComparisonProvider {

    // Method 1
    // To compare with name
    public static int compareByName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }

    // Method 2
    // To compare with age
    public int compareByAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }
}

public class MethodInference {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));

        ComparisonProvider comparator
                = new ComparisonProvider();

        personList.sort(comparator::compareByAge);
        Collections.sort(personList, comparator::compareByAge);

        personList.sort(ComparisonProvider::compareByName);
        Collections.sort(personList, ComparisonProvider::compareByName);

        List<String> namesList = new ArrayList<>();

        namesList.add("vicky");
        namesList.add("poonam");
        namesList.add("sachin");

        // Method reference to String type
        namesList.sort(String::compareTo);
        Collections.sort(namesList, String::compareToIgnoreCase);

        namesList.forEach(System.out::println);
    }


}
