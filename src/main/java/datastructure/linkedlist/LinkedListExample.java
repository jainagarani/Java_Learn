package datastructure.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedListExample {
    Node node;

    public void insert(int data){
        Node current = node;
        if(node == null){
            node = new Node(data);
            return;
        }
            while(current.next != null ){
                current = current.next;
            }
        current.next = new Node(data);
    }

    public void deleteWithValue(int value){
        if(node.data == value){
            node = node.next;
            return;
        }
        Node current = node;
        while(current.next != null){
            if(current.next.data == value)
                current.next = current.next.next;
            else
                current = current.next;
        }
        while(current.next != null){
            if(current.next.data == value){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }

    }

    public Node reverseNodeInLine(Node node) {

        Node next = null;
        Node prev = null;
        Node current = node;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }


    public void printInReverseOrder(Node node){
        List<Integer> intList = new ArrayList<>();
        while(node.next != null){
            intList.add(node.data);
            node = node.next;
        }
        intList.add(node.data);
        Collections.reverse(intList);
        System.out.println();
    intList.forEach(e -> System.out.print(e));
    }

    public void printLinkedList(){
        Node current = node;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args){
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.insert(5);
        linkedListExample.insert(4);
        linkedListExample.insert(3);
        linkedListExample.insert(2);
        linkedListExample.insert(1);
        linkedListExample.printLinkedList();
       // linkedListExample.node = linkedListExample.reverseNodeInLine(linkedListExample.node);
        linkedListExample.printInReverseOrder(linkedListExample.node);
        System.out.println("after reverse");
       // linkedListExample.printLinkedList();
        linkedListExample.deleteWithValue(1);

        linkedListExample.printLinkedList();





    }
}
