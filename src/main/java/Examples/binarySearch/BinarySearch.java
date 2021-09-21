package Examples.binarySearch;

public class BinarySearch {
    static int MAX_LEVEL = 0;
    
    Node root;
    public void insert(int data){
       root = insertData(data, root);
    }

    public Node insertData(int data, Node node){
        if( null == node){
            node = new Node(data);
            return node;
        }
        if(data < node.data){
            node.left = insertData(data, node.left);
        }else{
            node.right = insertData(data, node.right);
        }     return node;
    }


    public void print(Node root){
        System.out.println("Printing binary tree");
        printDetails(root);

    }

    public void printDetails(Node node){
        if(node != null){
            System.out.println(node.data);
            printDetails(node.left);
            printDetails(node.right);
        }
    }

    public void search(int data){
        Node current = root;
        while(current != null){
            if(data == current.data){
                System.out.println("Found");
                break;
            }else if(data < current.data){
                System.out.println("current.data"+current.data);
                current = current.left;
            }else{
                System.out.println("current.data"+current.data);
                current = current.right;
            }
        }

    }

    public void rightView(Node node, int current_level){
        if(null == node){
            return;
        }
        if(MAX_LEVEL < current_level){
            System.out.println(node.data);
            MAX_LEVEL = MAX_LEVEL +1;
        }
        rightView(node.right, current_level+1);
        rightView(node.left, current_level+1);

    }

    public void leftView(Node node, int current_level){
        if(null == node){
            return;
        }
        if(MAX_LEVEL < current_level){
            System.out.println(node.data);
            MAX_LEVEL = MAX_LEVEL +1;
        }
        rightView(node.left, current_level+1);
        rightView(node.right, current_level+1);

    }

    public Node delete(Node node , int data) {
        if (data < node.data) {
         node.left = delete(node.left, data);
        } else if (data > node.data) {
          node.right = delete(node.right, data);
        } else if (data == node.data) {
            //if both the nodes are null
            if (node.left == null && node.right == null) {
                node = null;
            }
            //if left node is null and right node is not null
            else if (node.left == null && node.right != null) {
                node = node.right;
            }
            //if left node is null and right node is not null
            else if (node.left != null && node.right == null) {
                node = node.left;
            } else {
                Node minimumValueNode = minimumElement(node.right);
                node.data = minimumValueNode.data;
                node.right = delete(node.right,minimumValueNode.data);

            }

        }
        return node;
    }



    public Node minimumElement (Node node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args){

        BinarySearch binarySearch = new BinarySearch();

      /*  binarySearch.root = new Examples.binarySearch.Node(15);
        binarySearch.root.left = new Examples.binarySearch.Node(10);
        binarySearch.root.left.left=new Examples.binarySearch.Node(5);
        binarySearch.root.right = new Examples.binarySearch.Node(35);
        binarySearch.root.right.left = new Examples.binarySearch.Node(30);
        binarySearch.root.right.left.left = new Examples.binarySearch.Node(20);
        binarySearch.root.right.right = new Examples.binarySearch.Node(45);*/

        binarySearch.insert(15);
        binarySearch.insert(10);
        binarySearch.insert(5);
        binarySearch.insert(35);
        binarySearch.insert(30);
        binarySearch.insert(20);
        binarySearch.insert(45);
     //   binarySearch.print(binarySearch.root);
        binarySearch.search(5);

   //     binarySearch.rightView(binarySearch.root, 1);
        binarySearch.MAX_LEVEL = 0;
     //   binarySearch.leftView(binarySearch.root, 1);
        System.out.println("Binary search delete");
        binarySearch.root = binarySearch.delete(binarySearch.root,15);
        binarySearch.print(binarySearch.root);
        
    }
}
