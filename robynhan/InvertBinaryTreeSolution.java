package org.robynhan.week6;

import org.robynhan.TreeNode;

public class InvertBinaryTreeSolution {
    public void invertBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }
}
