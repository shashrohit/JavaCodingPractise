package org.shashank.knowledge.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/*
Hash Map vs Hash Table
Hash map is not synchronized whereas Hash Table is synchronized which means only \
one thread can access an element at a time.
Hash map is not thread safe whereas Hash table is thread safe.
Hash table performance is poorer compared to Hash map.
Null keys and values are not allowed in Hash table.
 */
public class HashTableExample {

    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Shashank");
        ht.put(2, "Singh");

        for(Map.Entry<Integer, String> e: ht.entrySet()){
            System.out.println(e.getValue());
        }
    }
}
