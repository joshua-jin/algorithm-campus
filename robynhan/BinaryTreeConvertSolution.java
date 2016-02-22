package org.robynhan.week4;

import org.robynhan.TreeNode;

public class BinaryTreeConvertSolution {
    private TreeNode buildTree(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode node = new TreeNode(num[(start + end) / 2]);
        node.left = buildTree(num, start, (start + end) / 2 - 1);
        node.right = buildTree(num, (start + end) / 2 + 1, end);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] A) {
        if (A == null) {
            return null;
        }
        return buildTree(A, 0, A.length - 1);
    }
}
