package org.shashank.dump;

import org.shashank.dump.utils.Person;

import java.util.*;

public class Practise1 {

    public static void main(String[] args) {
        Integer i = 2;
        System.out.println(i+2);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(20);
        mySet.add(15);

        List<Integer> list = new ArrayList<>(mySet);
        list.add(1);

        Collections.sort(list);
        list.forEach(System.out::println);

        Person p1 = new Person("Shashank", "Singh");
        Person p2 = new Person("Dishant", "Singh");
        Person p3 = new Person("Manju", "Singh");

        List<Person> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);

        Collections.sort(list1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        list1.stream().map(a -> a.getFirstName()).forEach(System.out::println);
        list1.stream().map(Person::getFirstName).forEach(System.out::println);

        list1.add(new Person("Gaurav", "Upreti"));

        Collections.sort(list1, (a1, a2) -> a1.getFirstName().compareTo(a2.getFirstName()));
        list1.stream().map(Person::getFirstName).forEach(System.out::println);
    }
}
