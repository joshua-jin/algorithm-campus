package com.lintcode;

import java.util.ArrayList;

/**
 * @author : Joshua
 * Date:     1/25/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/binary-tree-preorder-traversal/">二叉树的前序遍历</a>
 */
public class BinaryTreePreorderTraversalRecursive {

    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
      }
    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> treeNodeList = new ArrayList<Integer>();
        if (root != null) {
            fillList(treeNodeList, root);
        }
        return treeNodeList;
    }

    private void fillList(ArrayList<Integer> treeNodeList, TreeNode node) {
        treeNodeList.add(node.val);
        if (node.left == null && node.right == null) {
            return;
        }
        if (node.left != null) {
            fillList(treeNodeList, node.left);
        }
        if (node.right != null) {
            fillList(treeNodeList, node.right);
        }
    }
}
