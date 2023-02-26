package org.shashank.knowledge.collections;

import java.util.HashMap;
import java.util.Map;

/*
Duplicate key is not allowed and results in updating existing pair
Duplicate values are allowed
Entry is Key Value pair (Map consists of entries)
Insertion order is not preserved
Hashing is used
Single null key allowed
multiple null values allowed
Fast search

Map interface methods -
put(k, v)
putAll(m1)
get(k)
remove(k)
containsKey(k)
containsValue(v)
isEmpty()
size()
clear()
Collection<V> values()-> returns Collection of values
Set<K> keySet() -> returns Set of keys
Set<Map.Entry<K,V>> entrySet() -> returns set of entries

Entry is an interface which extends Map interface
getKey()
getValue()
setValue(Object o)
 */
public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Shashank");
        map.put(2, "Rohit");
        map.put(3, "Singh");
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue(1));

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}