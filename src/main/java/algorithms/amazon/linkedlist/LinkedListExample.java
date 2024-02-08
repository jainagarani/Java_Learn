package algorithms.amazon.linkedlist;

import java.util.Stack;

public class LinkedListExample {

    Node head;

    public void append(int data){
        Node current = head;
        if(null == current){
            head = new Node(data);
            return;
        }
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node(data));
    }

    public void prepend(int data){
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    public void print(String message){
        System.out.println("***"+message);
        Node node = head;
        while(node != null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public void print(String message, Node node){
        System.out.println("***"+message);

        while(node != null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public Node reverse(Node node){
        Node prev = null;
        Node next = null;
        Node current = node;
        while(current != null){
             next = current.getNext();
             current.setNext(prev);
             prev = current;
             current = next;
        }
        node = prev;
        return node;
     }

    public void usingStackReverse(Node node){
        Node current = node;
        Stack<Node> stack = new Stack<>();
       while(current != null){
           stack.add(current);
           current = current.getNext();
       }
       while(!stack.isEmpty()){
           System.out.println(stack.pop().getData());
       }
    }

    public static void main(String[] args){
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.append(2);
        linkedListExample.append(3);
        linkedListExample.append(4);
        linkedListExample.append(5);
        linkedListExample.print("print");
        linkedListExample.prepend(1);
        linkedListExample.print("after prepend");

      //  linkedListExample.print("after reverse",linkedListExample.reverse(linkedListExample.head));
       System.out.println("After stack reverse");
        linkedListExample.usingStackReverse(linkedListExample.head);


    }
}
