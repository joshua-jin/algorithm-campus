package algorithm.lintcode.easy;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(InsertNodeInABinarySearchTree.TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + max(maxDepth(root.left), maxDepth(root.right));
    }

    private int max(int left, int right) {
        return left > right ? left : right;
    }
}
