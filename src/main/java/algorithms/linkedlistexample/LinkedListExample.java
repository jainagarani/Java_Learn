package algorithms.linkedlistexample;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedListExample {

    Node head;


    public void append(int data){
        Node current = head;
        if(null == head){
           head= new Node(data);
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteWithValue(int data){
        if(null == head){
            return;
        }
        Node current = head;
        if(head.data == data){
           head = head.next;
        }
        while(current.next != null){
            if(current.next.data == data)
            current.next = current.next.next;
            else
                current = current.next;
        }
    }

    public void printList(Node node){
        while(node != null){
            System.out.print(" " +node.data);
            node = node.next;
        }
        System.out.println();
    }

    public Node reverse(Node node){
        Node prev = null;
        Node next = null;
        Node current = node;
        while(current != null){
             next = current.next;
             current.next = prev;
             prev= current;
             current = next;
        }
        node = prev;
        return node;
    }

    public void delete(int position){
        Node current = head;
        if(position == 0){
           head = head.next;
        }
        for(int i =0; i< position-1; i++)
            current = current.next ;
        if(current == null && current.next == null){
            return;
        }
            current.next = current.next.next;
    }

    public static void main(String[] args){
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.append(2);
        linkedListExample.append(3);
        linkedListExample.append(5);
        linkedListExample.append(7);
        linkedListExample.append(8);
        linkedListExample.printList(linkedListExample.head);
        linkedListExample.deleteWithValue(7);
        linkedListExample.printList(linkedListExample.head);
        linkedListExample.head = linkedListExample.reverse(linkedListExample.head);
        System.out.println("after reverse");
        linkedListExample.printList(linkedListExample.head);
        linkedListExample.delete(2);
        linkedListExample.printList(linkedListExample.head);

    }
}
