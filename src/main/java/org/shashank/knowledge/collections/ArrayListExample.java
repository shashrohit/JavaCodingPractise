package org.shashank.knowledge.collections;

/*
List Interface methods (Additional)
add(index, Object o)
addAll(index, Collection c)
remove(index)
get(index)
set(index, Object o)
int indexOf(Object o);
List<E> subList(int fromIndex, int toIndex);
sort(Comparator<? super E> c) -> always takes comparator
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args){

        List<String> al = new ArrayList<>();
        al.add("shashank");
        al.add("Rohit");
        al.add("Singh");
        al.add(3, "Evans");
        System.out.println(al.get(0));
        al.remove("Evans");

        Collections.shuffle(al);
        al.forEach(System.out::println);

        Collections.sort(al);
        al.forEach(System.out::println);

        al.sort(Collections.reverseOrder());
        al.forEach(System.out::println);
    }
}
