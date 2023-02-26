package org.shashank.problems.misc;

public class CustomLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printLinkedList();
    }


}

class Node{

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList{

    Node head;
    Node tail;

    LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.tail = this.head;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
    }

    public void printLinkedList(){
        Node current = this.head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
