package org.shashank.knowledge.collections;

import java.util.LinkedList;

/*
Use Linked List when you have more insertion deletion as ArrayList requires shifting of elements
which is time taking. Linked List does not store elements sequentially. Don't use Linked List if you have
more retrieving operations
Node contains - prev, data, next
Duplicates allowed, insertion order is preserved
Null is allowed
Additional Methods of Linked List class-
addFirst(Object o)
addLast(Object o)
removeFirst()
removeLast()
getFirst()
getLast()
iterator()
 */
public class LinkedListExample {

    public static void main(String[] args){

        LinkedList<String> l = new LinkedList<>();
        l.add("A");
        l.addFirst("B");
        l.addLast("C");
        l.forEach(System.out::println);
    }
}

