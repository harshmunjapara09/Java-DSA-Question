import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public static void main(String[] args) {

    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int n = queue.size();
            Double sum = (double) 0;
            while (n!=0){
                TreeNode node  = queue.peek();

                if (node.left!=null){
                    queue.add(node.left);
                }if (node.right!=null){
                    queue.add(node.right);
                }
                sum += node.val;
                queue.poll();
                n--;
            }
        }

        return list;
    }
}