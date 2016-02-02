package com.lintcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : Joshua
 * Date:     2/1/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/binary-tree-inorder-traversal/">二叉树的中序遍历</a>
 */
public class BinaryTreeInorderTraversal {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        if (root != null) {
            fillList(resultList, root);
        }
        return resultList;
    }

    private void fillList(ArrayList<Integer> treeNodeList, TreeNode node) {
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        while (node != null || !nodeStack.isEmpty()) {
            while (node != null) {
                TreeNode t = node;
                node = node.left;
                nodeStack.push(t);
            }
            node = nodeStack.pop();
            treeNodeList.add(node.val);
            node = node.right;
        }
    }
}
