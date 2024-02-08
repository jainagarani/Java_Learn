package algorithms.datastructure;

public class LinkedListExample {
    Node head;

    public void add(int data){
        Node current = head;
        if(null == head){
            head = new Node(data);
            return ;
        }
        while(current.next != null){
            current = current.next;
        }
        current.setNext(new Node(data));
    }

    public void print(){
        Node current = head;
        System.out.println("In print");
       while(current != null){
           System.out.print(current.getData());
           current = current.getNext();
       }

    }

    public void reverse(){
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    public Node swapNodes(Node head, int k) {
         System.out.println(head);
        int i=1;
        int j = 1;
        Node node = head;
        Node prev1 = null;
        Node prev2 = null;
        Node node1 = null;
        Node node2 = null;
        while(node != null){
            System.out.println("node value"+node.data);
            System.out.println("i value "+i);
            if(k ==1 && i ==1){
                prev1 = null;
                node1 = node;
            }
           else if(i==k-1){
                prev1 = node;
                node1 = node.next;
            }
            node = node.next;
            i = i+1;
        }
        int tailNodeNumber = i-k-1;
        System.out.println("tailNodeNumber value "+tailNodeNumber);
        node = head;
        while(node != null){
            System.out.println("in while loop node value"+node.data);
            System.out.println("j value "+j);
            if(tailNodeNumber == j && i==j){
                prev2 = node;
                node2 = node.next;

                break;
            }
            else if(tailNodeNumber == j){
                System.out.println("j value "+j);
                System.out.println("tailNodeNumber value "+tailNodeNumber);
                prev2 = node;
                node2 = node.next;

                break;
            }
            j = j+1;
            node = node.next;
        }

        if(prev1 == null || prev2 == null||
                node1 == null || node2 == null){
            System.out.println("null value"+prev1);
            System.out.println("null value "+prev2);
            System.out.println("null value"+node1);
            System.out.println("null value"+node2);
         //  return head;
        }

        if(prev1 == null){
            head =node2;
            node2.next =node1.next;
        }
      else{
          prev1.next = node2;
        }
        prev2.next = node1;

        Node link =node2.next;
        node2.next = node1.next;
        node1.next = link;
        if(prev1 == null){
            node1.next = null;
        }

        return head;

    }

    public void swap(int num1, int num2){
        Node current = head;
        Node t1= null;
        Node t2= null;
        Node prev1 = null;
        Node prev2 = null;
        while(current.next != null){
                if(current.next.data==num1) {
                    t1 = current.next;
                    prev1 = current;
                    break;
                }else{
                    current = current.next;
                }
        }
        current = head;
        while(current.next != null ){
            if(current.next.data==num2) {
                t2 = current.next;
                prev2 = current;
                break;
            }else{
                current = current.next;
            }
        }
        if(t1 == null || t2 == null){
            return;
        }
        prev1.next = t2;
        prev2.next = t1;

        Node next = t1.next;
        t1.next = t2.next;
        t2.next = next;
    }

    public void delete(int data){
        Node current = head;
        if(current.data == data){
            head = current.next;
        }

        while(current.next != null){
            if(current.next.getData() == data){
                current.next = current.next.next;
            }else{
                current = current.getNext();
            }
        }
    }
    public static void main(String[] args){
        LinkedListExample listExample = new LinkedListExample();
        listExample.add(1);
        listExample.add(2);
     // listExample.add(3);
      //  listExample.add(4);
     //   listExample.add(5);
     //   listExample.add(6);
     //   listExample.add(7);*/
        listExample.print();
       // listExample.reverse();
        listExample.print();
       // listExample.delete(8);
        listExample.print();
       // listExample.swap(3,6);
        listExample.head = listExample.swapNodes(listExample.head, 2);
        listExample.print();

    }
}
