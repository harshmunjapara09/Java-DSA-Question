package Binary_Tree.Assignment;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(20);
        tree.root.right = new TreeNode(30);
        tree.root.left.left = new TreeNode(40);
        tree.root.left.right = new TreeNode(50);
        tree.root.right.left = new TreeNode(60);
        tree.root.right.right = new TreeNode(70);


//        tree.preOrder(tree.root);
//        tree.postOrder(tree.root);
//        tree.inOrder(tree.root);

//        Using Stack
//        tree.printlevel(tree.root);
//        tree.inOrderUsingStack(tree.root);

        tree.countNodes(tree.root);
//        System.out.println(BinaryTree.count);

//        tree.NthNode(tree.root, 6);

//        System.out.println(tree.Find(tree.root,10));

        System.out.println(tree.Height(tree.root));

        tree.printSpiralOrder(tree.root);


    }

}

class BinaryTree {
    static int count = 0;
    TreeNode root;

    public void printlevel(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode Node = queue.poll();
            System.out.print(Node.data + " ");

            if (Node.left != null) {
                queue.add(Node.left);
            }
            if (Node.right != null) {
                queue.add(Node.right);
            }
        }
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void inOrderUsingStack(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }

    }


    public void countNodes(TreeNode root) {
        if (root == null) {
            return;
        }else {
            count++;
        }
        countNodes(root.left);
        countNodes(root.right);
    }

    public void NthNode(TreeNode root, int i) {
        if (root == null) {
            return;
        }else{
            count++;
        }
        NthNode(root.left, i);
//        count++;
        if (i == count) {
            System.out.println(root.data);
            return;
        }
        NthNode(root.right, i);
    }

    public boolean Find(TreeNode root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }
        return Find(root.left, data) || Find(root.right, data);
    }

    public int Height(TreeNode root) {
        if (root==null){
            return 0;
        }
        int lheight = Height(root.left);
        int rheight = Height(root.right);

        return 1 + Math.max(lheight,rheight);
    }

    public void printSpiralOrder(TreeNode root) {
        Deque<TreeNode> dq = new LinkedList<>();
        dq.add(root);
        boolean isRev = false;
        while (!dq.isEmpty()){
            if (isRev){
                int size = dq.size();
                while (size > 0){
                    TreeNode node = dq.removeLast();
                    System.out.print(node.data+" ");

                    if (node.right!=null){
                        dq.addFirst(node.right);
                    }
                    if (node.left!=null){
                        dq.addFirst(node.left);
                    }
                    size--;
                }
                System.out.println();
                isRev = !isRev;
            }else {
                int size = dq.size();

                while (size > 0){
                    TreeNode node = dq.removeFirst();
                    System.out.print(node.data+" ");

                    if (node.left!=null){
                        dq.addLast(node.left);
                    }
                    if (node.right!=null){
                        dq.addLast(node.right);
                    }
                    size--;
                }
                System.out.println();
                isRev = !isRev;
            }
        }
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}