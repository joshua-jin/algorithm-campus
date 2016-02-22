package org.robynhan.week4;

import org.robynhan.TreeNode;

public class FlattenBinaryTreeSolution {

    public void flatten(TreeNode root) {
        flattenHelper(root);
    }

    private TreeNode flattenHelper(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        if (root.left == null) {
            return flattenHelper(root.right);
        }

        if (root.right == null) {
            root.right = root.left;
            root.left = null; // important!
            return flattenHelper(root.right);
        }

        // Divide
        TreeNode leftLastNode = flattenHelper(root.left);
        TreeNode rightLastNode = flattenHelper(root.right);

        // Conquer
        leftLastNode.right = root.right;
        root.right = root.left;
        root.left = null; // important!
        return rightLastNode;
    }
}
