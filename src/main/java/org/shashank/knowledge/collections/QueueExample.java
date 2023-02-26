package org.shashank.knowledge.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Queue interface implemented by Priority Queue
FIFO
Insertion order is preserved
duplicates allowed
Methods in Queue interface -
add() -> exception
offer() -> false
element() -> Head element, exception if empty
peek() -> -> Head element, null if empty
remove() -> returns head and removes it, exception if empty
poll() -> returns head and does not remove it, null if empty
iterator()

Deque inherits all methods of Queue and -
addFirst()
addLast()
offerFirst()
offerLast()
peekFirst()
peekLast()
removeFirst()
removeLast()
pollFirst()
pollLast()
iterator()
getFirst()
getLast()
For stack implemented by Deque -
push()
pop()

Note - Queue extended by Dequeue interface
Dequeue implemented by ArrayDeque
 */
public class QueueExample {

    public static void main(String[] args) {
        Deque<String> pq = new ArrayDeque<>();
//        Queue<String> pq = new PriorityQueue<>();
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
