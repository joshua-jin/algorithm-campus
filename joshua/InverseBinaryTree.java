package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/28/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/invert-binary-tree/">翻转二叉树</a>
 */
public class InverseBinaryTree {
      public class TreeNode {
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
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        doInvert(root);
    }

    private void doInvert(TreeNode node) {
        if (node.left == null && node.right == null) {
            return;
        }

        TreeNode left = node.left;
        TreeNode right = node.right;

        node.left = right;
        node.right = left;

        if (node.left != null) {
            doInvert(node.left);
        }

        if (node.right != null) {
            doInvert(node.right);
        }
    }
}
