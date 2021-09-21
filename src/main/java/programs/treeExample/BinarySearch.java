package programs.treeExample;

public class BinarySearch {
    Node root;
    int max_level =0;

    public void insert(int data){
        root = insertData(root,data);
    }

    public Node insertData(Node node, int data){
        if(null == node){
            node = new Node(data);
            return node;
        }
        if(data < node.data){
           node.left = insertData(node.left,data);
        }else{
          node.right = insertData(node.right,data);
        }
        return node;
    }

    public void print(){
        StringBuilder stringBuilder = new StringBuilder();
        printDetails(stringBuilder, root);
        System.out.println("\n");
        System.out.println(stringBuilder.toString());
    }

    public void printDetails(StringBuilder stringBuilder , Node node){
        if(null != node) {
            stringBuilder.append(node.data);
            System.out.print(node.data);
            printDetails(stringBuilder,node.left);
            printDetails(stringBuilder,node.right);
        }
    }

    public void printRightView(){
        rightViewUtil(root,1);

    }

    public void printLeftView(){
        System.out.println("\n In Left View");
        max_level = 0;
       leftViewUtil(root,1);

    }

    public void rightViewUtil(Node node, int current_level){
        if(node == null){
            return ;
        }
        if(max_level < current_level){
            System.out.println(node.data);
            max_level = current_level;
        }
        rightViewUtil(node.right,current_level+1);
        rightViewUtil(node.left,current_level+1);

    }

    public void leftViewUtil(Node node, int current_level){
        if(node == null){
            return ;
        }
        if(max_level < current_level){
            System.out.println(node.data);
            max_level = current_level;
        }
        leftViewUtil(node.left,current_level+1);
        leftViewUtil(node.right,current_level+1);

    }

    public static void main(String[] args){
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.insert(5);
        binarySearch.insert(6);
        binarySearch.insert(4);
        binarySearch.insert(3);
        binarySearch.insert(2);
        binarySearch.print();
        binarySearch.printRightView();
        binarySearch.printLeftView();
    }
}
