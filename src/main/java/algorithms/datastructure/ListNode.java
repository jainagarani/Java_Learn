package algorithms.datastructure;

/**
 * Definition for singly-linked list.
 * */
  public class ListNode {
     int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
      ListNode head;
      public ListNode add(int val){
          ListNode current = head;
          if(head == null){
              head = new ListNode(val);
              return head;
          }
          while(current.next != null){
              current = current.next;
          }
          current.next = new ListNode(val);
       return head;
      }

    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        ListNode temp = new ListNode(0);
        temp.next = head;
       ListNode current = temp;
        while(current.next != null && current.next.next != null){
            ListNode firstNode = current.next;
            ListNode secondNode  = current.next.next;
            firstNode.next = secondNode.next;
            current.next = secondNode;
            current.next.next =firstNode;
            current = current.next.next;
        }
      //  head = node;
        return temp.next;
    }

    public ListNode swapPairs1(ListNode head) {
        ListNode node = head;

        ListNode current = node;
        while(current != null && current.next != null){
            ListNode firstNode = current;
            ListNode secondNode  = current.next;
            firstNode.next = secondNode.next;
            current = secondNode;
            current.next=firstNode;
            current = current.next.next;
        }
        //  head = node;
        return node;
    }

    public void print(ListNode node){
          System.out.println("In print");

          while(node != null){
              System.out.print(node.val);
              node = node.next;
          }
    }

    public static void main(String[] args){
          Solution solution = new Solution();
          solution.add(1);
          solution.add(2);
          solution.add(3);
          solution.add(4);
          solution.print(solution.head);
          solution.head = solution.swapPairs1(solution.head);
          solution.print(solution.head);

    }

}
