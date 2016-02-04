package algorithm.lintcode.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            appendPath(root, "", result);
        }
        return result;
    }

    private void appendPath(TreeNode node, String path, List<String> result) {
        path = path + node.val;
        if(node.left == null && node.right == null) {
            result.add(path);
        }
        if(node.left != null) {
            appendPath(node.left, path + "->", result);
        }
        if(node.right != null) {
            appendPath(node.right, path + "->", result);
        }
    }
}
