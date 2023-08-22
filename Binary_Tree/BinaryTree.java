package Binary_Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    Node root;
    public static void main(String[] args) {
        Node root  = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);

//        Using Recursion
//        printPreOrder(root);
//        printPostOrder(root);
        printInOrder(root);

//        Using Iteration

        System.out.println(print(root));

    }

    private static List<Integer> print(Node root) {
        List<Integer> ans  = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (true){
            if (node!=null){
                stack.push(node);
                node = node.left;
            }else {
                if (stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                ans.add(node.data);
                node = node.right;
            }
        }
        return ans;
    }


    private static void printInOrder(Node root) {
        if (root==null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ") ;
        printInOrder(root.right);
    }

    private static void printPostOrder(Node root) {
        if (root==null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ") ;
    }

    private static void printPreOrder(Node root) {
        if (root==null){
            return;
        }
        System.out.print(root.data + " ") ;
        printPreOrder(root.left);
        printPreOrder(root.right);
    }


}
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
