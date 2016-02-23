package org.robynhan.week6;

import org.robynhan.TreeNode;

public class InsertBianrySearchTree {
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) return node;
        if (node == null) return root;

        TreeNode rootCopy = root;
        while (root != null) {
            if (root.val <= node.val && root.right == null) {
                root.right = node;
                break;
            }
            else if (root.val > node.val && root.left == null) {
                root.left = node;
                break;
            }
            else if(root.val <= node.val) {
                root = root.right;
            }
            else {
                root = root.left;
            }
        }
        return rootCopy;
    }
}
