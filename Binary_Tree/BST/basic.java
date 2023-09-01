package Binary_Tree.BST;

public class basic {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(30);
        tree.insert(10);
        tree.insert(20);
        tree.insert(60);
        tree.insert(50);
        tree.print(tree.root);
        System.out.println();
        tree.delete(10);
        System.out.println();
        tree.print(tree.root);
    }
}

class BinaryTree {
    TreeNode root;

    public void insert(int value) {
        root = insert(value, root);
    }

    private TreeNode insert(int value, TreeNode root) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        } else if (value > root.data) {
            root.right = insert(value, root.right);
        } else {
            root.left = insert(value, root.left);
        }
        return root;
    }

    public void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode root, int value) {
        if (root == null) {
            return root;
        }
        if (value > root.data) {
            root.right = delete(root.right, value);
        } else if (value < root.data) {
            root.left = delete(root.left, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    private int minValue(TreeNode node) {
        int min = node.data;
        while (node.left != null) {
            min = node.left.data;
        }
        return min;
    }

}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.data = value;
    }
}
