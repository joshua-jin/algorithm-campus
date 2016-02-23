package org.robynhan.week5;

import org.robynhan.TreeNode;

public class IdenticalBinaryTreeSolution {
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        }

        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }
}
