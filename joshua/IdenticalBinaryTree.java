package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/20/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/identical-binary-tree/">等价二叉树</a>
 */

public class IdenticalBinaryTree {

      public class TreeNode {
          public int val;
          public TreeNode left, right;

          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }

    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        return compareNode(a, b);
    }

    public Boolean compareNode(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null && b != null) {
            return false;
        }

        if (a != null && b == null) {
            return false;
        }

        if (a.val != b.val) {
            return false;
        }

        return compareNode(a.left, b.left) && compareNode(a.right, b.right);
    }
}
