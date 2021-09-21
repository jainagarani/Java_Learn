package programs.linkedlistpractice;



public class LinkedListExample {
    Node head;

    public void append(int data){
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

    public void prepend(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

    }

    public void print(){
        System.out.println("\n Printing Details");
        Node current = head;
        while(current != null){
            System.out.print(current.data);
            current = current.next;
        }
    }

    public void reverse(){
        Node current = head;
        Node next = null;
        Node previous = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
         head = previous;
    }

    public void delete(int data){
        Node current = head;
        if(current.data == data){
            head = current.next;
            return;
        }
       while(current != null){
           if(current.next != null && current.next.data == data){
               current.next = current.next.next;
           }else{
               current = current.next;
           }
       }
    }

    public void insert(int position, int data){

        if(position==0){
            Node node = new Node(data);
            node.next = head;
            head = node;
            return;
        }
        Node current = head;
        int i = 0;
      while(current != null){
          if(i <position-1){
              current = current.next;
              i++;
          }else{
              Node node = new Node(data);
              node.next = current.next;
              current.next = node;
              break;

          }
      }




    }

    public static void main(String[] args){
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.append(5);
        linkedListExample.append(7);
        linkedListExample.append(8);
        linkedListExample.print();
        linkedListExample.prepend(1);
        linkedListExample.print();
        linkedListExample.reverse();
        linkedListExample.print();
        linkedListExample.delete(10);
        linkedListExample.print();
        linkedListExample.insert(2,11);
        linkedListExample.print();
    }
}
