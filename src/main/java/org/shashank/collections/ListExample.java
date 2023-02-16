package org.shashank.collections;

/*Collection is a root Interface implemented by List, Set and Queue interfaces
List interface is implemented by ArrayList and LinkedList
Set interface is implemented by HashSet
Map is also a root interface implemented by HashMap and HashTable
java.util.Collections class which has some methods that can be applied on collections like
sort, reverse, add, remove, get, replace, binary search etc.

Collection Interface Methods -
add(Object o)
addAll(Collection c)
remove(Object o)
removeAll(Collection c)
retainAll(Collection o)
clear()
isEmpty()
size()
contains(Object o)
containsAll(Collection c)
toArray() -> return Object array

List Interface methods (Additional)
add(index, Object o)
addAll(index, Collection c)
remove(index)
get(index)
set(index, Object o)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

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
