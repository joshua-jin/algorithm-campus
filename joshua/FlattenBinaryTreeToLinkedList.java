package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/9/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/flatten-binary-tree-to-linked-list/">将二叉树拆成链表</a>
 */
public class FlattenBinaryTreeToLinkedList {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        // write your code here
        if (root == null) {
            return;
        }
        buildLinkedList(root);
    }

    private TreeNode buildLinkedList(TreeNode node) {
        TreeNode leftNode = node.left;
        TreeNode rightNode = node.right;
        TreeNode lastTreeNode = node;

        if (leftNode != null) {
            node.right = leftNode;
            node.left = null;
            lastTreeNode = buildLinkedList(leftNode);
        }
        if (rightNode != null) {
            lastTreeNode.right = rightNode;
            lastTreeNode = buildLinkedList(rightNode);
        }
        return lastTreeNode;
    }
}
