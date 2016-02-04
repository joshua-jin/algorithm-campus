package algorithm.lintcode.easy;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            while (root.left != null || root.right != null) {
                TreeNode node = new TreeNode(root.val);
                if (root.left != null) {
                    node.right = root.right;
                    root = root.left;
                } else {
                    root = root.right;
                }
                stack.push(node);
            }
            result.add(root.val);
            root = stack.empty() ? null : stack.pop();
        }
        return result;
    }
}