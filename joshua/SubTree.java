package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/24/16
 */
public class SubTree {
      public static class TreeNode {
          public int val;
          public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }

    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
        if (T2 == null) {
            return Boolean.TRUE;
        }
        if (T1 == null && T2 != null) {
            return Boolean.FALSE;
        }

        return goThroughAndCompare(T1, T2);
    }

    private boolean isMatch(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return Boolean.TRUE;
        }

        if (node1 != null && node2 == null) {
            return Boolean.FALSE;
        }

        if (node1 == null && node2 != null) {
            return Boolean.FALSE;
        }

        if (node1.val != node2.val) {
            return Boolean.FALSE;
        }

        return (isMatch(node1.left, node2.left) && isMatch(node1.right, node2.right));
    }

    private Boolean goThroughAndCompare(TreeNode node1, TreeNode node2) {
        Boolean result = isMatch(node1, node2);
        if (result) {
            return Boolean.TRUE;
        }

        if (node1.left != null) {
            Boolean leftResult = goThroughAndCompare(node1.left, node2);
            if (leftResult) {
                return Boolean.TRUE;
            }
        }

        if (node1.right != null) {
            Boolean rightResult = goThroughAndCompare(node1.right, node2);
            if (rightResult) {
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }
}
