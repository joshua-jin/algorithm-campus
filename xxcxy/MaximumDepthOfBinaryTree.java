package algorithm.lintcode.easy;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(InsertNodeInABinarySearchTree.TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
