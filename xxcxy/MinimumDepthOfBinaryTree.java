package algorithm.lintcode.easy;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    private int min(final int a, final int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        return a < b ? a : b;
    }

    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
}
