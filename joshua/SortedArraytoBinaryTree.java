package com.lintcode;

import java.util.Arrays;

/**
 * @author : Joshua
 * Date:     2/4/16
 */
public class SortedArraytoBinaryTree {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        if (A.length == 0) {
            return null;
        }
        return buildTree(A);
    }

    private int getMiddleValue(int[] A) {
        return A.length / 2;
    }

    private TreeNode buildTree(int[] A) {
        int middle = A.length / 2;
        TreeNode node = new TreeNode(A[middle]);
        if (A.length <= 1) {
            node.left = null;
            node.right = null;
        }
        if (A.length > 1 && A.length < 3) {
            node.left = buildTree(Arrays.copyOfRange(A, 0, middle));
            node.right = null;
        }
        if (A.length >= 3) {
            node.left = buildTree(Arrays.copyOfRange(A, 0, middle));
            node.right = buildTree(Arrays.copyOfRange(A, middle + 1, A.length));
        }
        return node;
    }

    private void buildTree(TreeNode rootNode , int[] leftPart, int[] rightPart) {
        int leftMiddleValue = getMiddleValue(leftPart);
        int rightMiddleValue = getMiddleValue(rightPart);

        if (leftPart.length > 1) {
            rootNode.left = new TreeNode(leftPart[leftMiddleValue]);
        }
        else if (leftPart.length == 1) {
            rootNode.left = new TreeNode(leftPart[0]);
        }
        else {
            rootNode.left = null;
        }
        if (rightPart.length > 1) {
            rootNode.right = new TreeNode(rightPart[rightMiddleValue]);
        }
        else if (rightPart.length == 1) {
            rootNode.right = new TreeNode(rightPart[0]);
        }
        else {
            rootNode.right = null;
        }

        if (leftPart.length >= 1) {
            buildTree(rootNode,
                    Arrays.copyOfRange(leftPart, 0, leftMiddleValue),
                    Arrays.copyOfRange(leftPart, leftMiddleValue + 1, leftPart.length));
        }

        if (rightPart.length >= 1) {
            buildTree(rootNode,
                    Arrays.copyOfRange(rightPart, 0, rightMiddleValue),
                    Arrays.copyOfRange(rightPart, rightMiddleValue + 1, rightPart.length));
        }
    }
}
