package basics.dataStructure;

public class LinkedListExample {

    Node head;
    public static void main(String[] args){

        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.append(5);
        linkedListExample.append(7);
        linkedListExample.append(8);
        linkedListExample.append(9);

        linkedListExample.print();
        linkedListExample.reverse();
        linkedListExample.print();
    }

    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
        }
    }

    public void reverse(){
        Node current = head;
        Node previous = null;
        Node next  = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current =next;
        }
        head = previous;
    }
}
