package algorithms.datastructure.tree;

import javax.transaction.TransactionRequiredException;
import java.util.*;


public class BinaryTreeExample {

     TreeNode root;
    public static void main(String[] args){



        BinaryTreeExample binaryTreeExample = new BinaryTreeExample();
       /* binaryTreeExample.root = new TreeNode(1);
        binaryTreeExample.root.right = new TreeNode(2);
        binaryTreeExample.root.right.left = new TreeNode(3);*/

        binaryTreeExample.root = new TreeNode(1);
        binaryTreeExample.root.left = new TreeNode(2);
        binaryTreeExample.root.right = new TreeNode(3);
        binaryTreeExample.root.left.left = new TreeNode(4);
        binaryTreeExample.root.left.right = new TreeNode(5);

       // binaryTreeExample.preorderTraversal(binaryTreeExample.root).stream().forEach(e -> System.out.println(e));
        List<Integer> list = new ArrayList<>();
        System.out.println("In order traversal  recursion");
      // binaryTreeExample.inOrderTraversalWithRecursion(binaryTreeExample.root);
       // binaryTreeExample.postOrderTraversalWithoutRecursion(binaryTreeExample.root);
       // list.stream().forEach(e-> System.out.println(e));
        System.out.println("In order traversal without recursion");
       // binaryTreeExample.inOrderTraversalWithRecursion(binaryTreeExample.root);

        System.out.println("BFS ");
        binaryTreeExample.bfsLevelOrderTraversal(binaryTreeExample.root);

    }

    public void postOrderTraversalWithRecursion(TreeNode node){
        if(node == null){
            return;
        }
        postOrderTraversalWithRecursion(node.left);
        postOrderTraversalWithRecursion(node.right);
        System.out.println(node.val);

    }

    public void inOrderTraversalWithRecursion(TreeNode node){
        if(node == null){
            return;
        }
        inOrderTraversalWithRecursion(node.left);
        System.out.println(node.val);
        inOrderTraversalWithRecursion(node.right);


    }

    public void preOrderTraversalRecursive(TreeNode node, List<Integer> list){

        if(node == null){
            return;
        }

        list.add(node.val);

        preOrderTraversalRecursive(node.left, list);
        preOrderTraversalRecursive(node.right, list);


    }

    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode current;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            current = stack.pop();
            list.add(current.val);

            if(current.right != null){
                stack.push(current.right);
            }

            if(current.left != null){
                stack.push(current.left);
            }

        }
        return list;
    }

    public void postOrderTraversalWithoutRecursion(TreeNode node){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode current = stack.peek();

            if(current.isLeaf()){
                System.out.println(stack.pop().val);
            }else{
                if(current.right != null){
                    stack.push(current.right);
                    current.right = null;
                }

                if(current.left != null){
                    stack.push(current.left);
                    current.left = null;
                }
            }
        }
    }


    public void inOrderTraversalWithoutRecursion(TreeNode node){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(node.right!= null){
            stack.push(node.right);
        }else {
            stack.push(node);
        }
        while(!stack.isEmpty()){
            TreeNode current = stack.peek();

            if(current.isLeaf()){
                System.out.println(stack.pop().val);
            }else{
                if(current.right != null){
                    stack.push(current.right);
                    current.right = null;
                }
                stack.push(current);

                if(current.left != null){
                    stack.push(current.left);
                    current.left = null;
                }
            }
        }
    }

    public void bfsLevelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, List<TreeNode>> levelMap = new HashMap<>();
        queue.add(root);
        int level =1;
        levelMap.putIfAbsent(level, new ArrayList<>());
        levelMap.get(level).add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
         //   System.out.println("level "+level);
         //   System.out.println(current.val);


            if(current.left != null){
                levelMap.putIfAbsent(level+1, new ArrayList<>());
                levelMap.get(level+1).add(current.left);

                queue.add(current.left);
            }
            if(current.right != null){
                levelMap.putIfAbsent(level+1, new ArrayList<>());
                levelMap.get(level+1).add(current.right);
                queue.add(current.right);
            }
           level = level+1;

        }

        levelMap.entrySet().forEach(entry -> {
            System.out.println("level "+entry.getKey());
     entry.getValue().stream().forEach(node -> System.out.println(node.val));
        });
    }
}
