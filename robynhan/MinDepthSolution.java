package org.robynhan.week9;

import org.robynhan.TreeNode;

public class MinDepthSolution {
    public int minDepth(TreeNode root) {
        // write your code here
        if(root ==null) {
            return 0;
        }
        return minDepthInner(root);
    }

    private int minDepthInner(TreeNode root) {
        if(root ==null) {
            return Integer.MAX_VALUE;
        }
        if(root.left ==null && root.right ==null) {
            return 1;
        }
        return Math.min(minDepthInner(root.left), minDepthInner(root.right)) + 1;
    }
}
