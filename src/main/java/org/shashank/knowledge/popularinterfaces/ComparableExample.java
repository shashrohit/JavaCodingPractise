package org.shashank.knowledge.popularinterfaces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import java.util.Arrays;
import java.util.List;

/*
The Comparable interface is used to compare an object of a same class with
another object of same class. The class has to implement the java.lang.Comparable interface.

public interface Comparable<T> {
    public int compareTo(T o);
}
 */

@AllArgsConstructor @Getter @Setter
class Student implements Comparable<Student>{

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;

    @Override
    public int compareTo(Student s) {
        int i = this.firstName.compareTo(s.firstName);
        if (i != 0) {
            return i;
        } else {
            return this.lastName.compareTo(s.lastName);
        }
    }
}
public class ComparableExample {
    public static void main(String[] args) {

        Student s1 = new Student("Shashank", "Singh");
        Student s2 = new Student("Dishant", "Singh");

        Student[] students = {s1, s2};
        Arrays.sort(students);
        Arrays.stream(students).forEach(e -> System.out.println(e.getFirstName()));
        // Since Student already implements Comparable, Comparator is not required

        List<Student> list = Arrays.asList(s1, s2);
        list.sort(Student::compareTo);
        list.forEach(e -> System.out.println(e.getFirstName()));
    }
}
