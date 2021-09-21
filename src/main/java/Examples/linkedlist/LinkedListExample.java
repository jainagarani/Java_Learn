package Examples.linkedlist;

public class LinkedListExample {
    Node head;

    public void insert(int data){
        Node current = head;
        if(null == head){
           head = new Node(data);
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void reverse(Node node){
        Node current = node;
        Node prev = null;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;


    }

    public void print(Node head){
        System.out.println("Printing");
        Node current = head;
        while(null != current){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void delete(int data){
        Node current = head;
        if(null == current){
            return;
        }
        if(current.data == data){
            head = current.next;
        }
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }


    }

    public static void main(String[] args){
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.insert(3);
        linkedListExample.insert(4);
        linkedListExample.insert(5);
        linkedListExample.insert(6);
        linkedListExample.print(linkedListExample.head);
       // linkedListExample.reverse(linkedListExample.head);
        System.out.println("after reverse");
       // linkedListExample.print(linkedListExample.head);
        linkedListExample.delete(6);
        linkedListExample.print(linkedListExample.head);

    }
}
