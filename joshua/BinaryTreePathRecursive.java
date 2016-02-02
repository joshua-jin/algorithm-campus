package com.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Joshua
 * Date:     1/26/16
 */
public class BinaryTreePathRecursive {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        // Write your code here
        List<String> nodePathList = new ArrayList<String>();
        if (root != null) {
            fillList(nodePathList, "", root);
        }
        return nodePathList;
    }

    private void fillList(List<String> nodePathList, String pathString, TreeNode node) {
        if (node.left == null && node.right == null) {
            nodePathList.add(String.format("%s%d", pathString, node.val));
            return;
        }
        String currentPathString = String.format("%s%d->", pathString, node.val);
        if (node.left != null) {
            fillList(nodePathList, currentPathString, node.left);
        }
        if (node.right != null) {
            fillList(nodePathList, currentPathString, node.right);
        }
    }
}
