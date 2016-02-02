package com.lintcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : Joshua
 * Date:     1/25/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/binary-tree-preorder-traversal/">二叉树的前序遍历</a>
 */
public class BinaryTreePreorderTraversal {

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
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        while (node != null || !nodeStack.isEmpty()) {
            while (node != null) {
                treeNodeList.add(node.val);
                TreeNode t = node;
                nodeStack.push(t);
                node = node.left;
            }
            node = nodeStack.pop().right;
        }
    }
}
