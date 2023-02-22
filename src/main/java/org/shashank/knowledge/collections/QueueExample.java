package org.shashank.knowledge.collections;

import java.util.PriorityQueue;

/*
FIFO
PriorityQueue implements
Insertion order is preserved
duplicates allowed
Methods in Queue interface -
add() -> exception
offer() -> false
element() -> Head element, exception if empty
peek() -> -> Head element, null if empty
remove() -> returns head and removes it, exception if empty
poll() -> returns head and removes it, null if empty
iterator()
 */
public class QueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("A");
        pq.offer("B");
        System.out.println(pq.element());
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.poll());
        pq.add("A");
        pq.offer("B");

        for(String element: pq){
            System.out.println(element);
        }
    }
}
