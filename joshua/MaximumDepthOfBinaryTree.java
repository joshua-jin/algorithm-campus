package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/29/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/maximum-depth-of-binary-tree/">二叉树的最大深度</a>
 */
public class MaximumDepthOfBinaryTree {
      public class TreeNode {
          public int val;
          public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }

    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if (root != null) {
            return getMaxDepth(root, 1);
        }
        return 0;
    }

    private int getMaxDepth(TreeNode node, int initValue) {
        int leftDepth = node.left == null ? initValue : getMaxDepth(node.left, initValue + 1);
        int rightDepth = node.right == null ? initValue : getMaxDepth(node.right, initValue + 1);
        return Math.max(leftDepth, rightDepth);
    }
}
