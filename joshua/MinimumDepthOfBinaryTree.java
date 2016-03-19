package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/13/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/minimum-depth-of-binary-tree/">二叉树的最小深度</a>
 */
public class MinimumDepthOfBinaryTree {
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
    public int minDepth(TreeNode root) {
        // write your code here
        if (root == null) {
            return 0;
        }
        return getMinimumDepth(root, 1);
    }

    private int getMinimumDepth(TreeNode node, int currentDepth) {
        if (node.left == null && node.right == null) {
            return currentDepth + 1;
        }

        if (node.left == null) {
            return getMinimumDepth(node.right, currentDepth + 1);
        }

        if (node.right == null) {
            return getMinimumDepth(node.left, currentDepth + 1);
        }

        return Math.min(getMinimumDepth(node.left, currentDepth + 1),
                        getMinimumDepth(node.right, currentDepth + 1));
    }
}
