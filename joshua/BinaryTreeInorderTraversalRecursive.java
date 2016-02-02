package com.lintcode;

import java.util.ArrayList;

/**
 * @author : Joshua
 * Date:     1/26/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/binary-tree-inorder-traversal/">二叉树的中序遍历</a>
 */
public class BinaryTreeInorderTraversalRecursive {
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
        if (node.left == null && node.right == null) {
            treeNodeList.add(node.val);
            return;
        }

        if (node.left != null) {
            fillList(treeNodeList, node.left);
        }

        treeNodeList.add(node.val);

        if (node.right != null) {
            fillList(treeNodeList, node.right);
        }
    }
}
