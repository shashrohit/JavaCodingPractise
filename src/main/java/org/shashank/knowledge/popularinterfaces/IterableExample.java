package org.shashank.knowledge.popularinterfaces;

import java.util.*;

/*
An iterable interface allows an object to be the target of
enhanced for loop(for-each loop).

public interface Iterable<T>
{
  Iterator<T>    iterator();
  Spliterator<T> spliterator();
  void forEach(Consumer<? super T> action);
}

There are three ways in which objects of Iterable can be iterated.
Using enhanced for loop(for-each loop)
Using Iterable forEach loop
Using Iterator<T> interface

Important - public interface Collection<E> extends Iterable<E>
 */
public class IterableExample {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        //Enhanced for
        for(String item: list){
            System.out.println(item);
        }

        // Iterate through the list
        list.forEach(System.out::println);

        // Iterator
        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) System.out.println(itr.next());
    }
}
