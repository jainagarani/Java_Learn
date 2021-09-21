package preparation.binaryTree;

import java.util.*;

public class BinaryTreeImpl {

    Node root;

    public void insert(int data){
        if(root == null){
            root = new Node(data);
            return;
        }
        Node node = root;
        while(node != null){
            if(data < node.data){
                node = node.left;
            }else{
                node = node.right;
            }
        }
        node = new Node(data);
    }

    public void printReverseLevelOrder(Node node){
        if(node == null){
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        Deque<Node> stack = new ArrayDeque<>();

        queue.add(node);

        Node current;

        while (!queue.isEmpty()){
            current = queue.poll();
            stack.push(current);
            if(current.right != null){
                queue.add(current.right);
            }
            if(current.left != null){
                queue.add(current.left);
            }
        }
        while(!stack.isEmpty()){
            Node element = stack.poll();
            updateWeight(element);
           System.out.println(element.data +"weight "+ element.weight);

        }




    }

    public void updateWeight(Node node){
        int weight = node.data;
        if(node.right != null){
            weight +=node.right.data;
        }
        if(node.left != null){
            weight +=node.left.data;
        }
        node.setWeight(weight);

    }

    public  void print(Node node){
        if(node != null){
            System.out.print(node.data);
            print(node.left);
            print(node.right);
        }

    }

    public void printReverseLevelOrderMap(Node root){
        Map<Integer, List<Node>>  map = new HashMap<>();
        storeLevelOrder(root, 1,map);
        for(int i = map.size(); i > 0 ; i--){
           List<Node> nodes = map.get(i);
           System.out.print("Level " +i +" : ");
           for(Node node :nodes){
               System.out.print(node.data+ " ");
           }
           System.out.println();

        }
    }

    public void storeLevelOrder(Node node, int level, Map<Integer, List<Node>> map){
        if(node == null){
            return;
        }
        map.putIfAbsent(level,new ArrayList<>());
        map.get(level).add(node);

        storeLevelOrder(node.left,level+1,map);
        storeLevelOrder(node.right,level+1,map);
    }


    public static void main(String[] args){
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        //new BinaryTreeImpl().print(root);
        //new BinaryTreeImpl().printReverseLevelOrder(root);
        new BinaryTreeImpl().printReverseLevelOrderMap(root);



    }
}
