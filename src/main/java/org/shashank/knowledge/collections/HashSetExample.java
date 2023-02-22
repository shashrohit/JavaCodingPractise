package org.shashank.knowledge.collections;

/*
Hash Set uses hash code when inserting and allows null.
No duplicates but null is allowed
Default size is 16. Load Factor/ Fill ratio is 0.75. As soon as 75% hash set is filled, new Hash set
object is created.
Sorting is not possible as index is not there.
Set Interface Additional Methods
add(Object o)
addAll(Collection c)
remove(Object o)
removeAll(Collection c)
contains(Object o)
isEmpty()
size()
iterator()
 */

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>(100, 0.9F);

    }
}