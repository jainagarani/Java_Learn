package algorithms.binarySearch;

public class BinarySearchExample {
    Node root;
     int max_level =0;

    public void insert(int data){
        root = insert(root,data);
    }
    public Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
        }else{
            if(data <= root.data){
                root.left = insert(root.left, data);
            }
            else{
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public boolean search(int data){
        return search(root, data);
    }

    public void rightViewUtil(Node root, int current_level){
        if(null == root){
            return;
        }
        if(max_level <  current_level){
            System.out.print(root.data);
            max_level = current_level;
        }
        rightViewUtil(root.right,current_level+1);
        rightViewUtil(root.left,current_level+1);
    }

    public void rightViewUtil1(Node root, int current_level){
        if(null == root){
            return;
        }
        if(max_level < current_level){
            System.out.println(root.data);
            max_level = current_level;
        }

        rightViewUtil1(root.right, current_level+1);
        rightViewUtil1(root.left, current_level+1);

    }



    public void printRightView(Node root){
        System.out.println("\n");
        rightViewUtil1(root,1);

    }

    public boolean search(Node root, int data){
        boolean found = false;
        while(null != root & !found ){
            if(root.data == data){
                found = true;
                break;
            }
            if(data <= root.data){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return found;
    }


    public static void main(String[] args){
        BinarySearchExample binarySearchExample = new BinarySearchExample();
        binarySearchExample.root = new Node(15);
        binarySearchExample.root.left = new Node(10);
        binarySearchExample.root.left.left=new Node(5);
        binarySearchExample.root.right = new Node(35);
        binarySearchExample.root.right.left = new Node(30);
        binarySearchExample.root.right.left.left = new Node(20);
        binarySearchExample.root.right.right = new Node(45);
       // System.out.println(binarySearchExample.search(4));
       // System.out.println(binarySearchExample.search(5));
        binarySearchExample.printRightView(binarySearchExample.root);

    }
}
