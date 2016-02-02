package com.lintcode;

import java.util.ArrayList;

/**
 * @author : Joshua
 * Date:     1/26/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/binary-tree-postorder-traversal/">二叉树的后序遍历</a>
 */
public class BinaryTreePostorderTraversalRecursive {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public ArrayList<Integer> postorderTraversal(TreeNode root) {
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
        if (node.right != null) {
            fillList(treeNodeList, node.right);
        }
        treeNodeList.add(node.val);
    }
}
