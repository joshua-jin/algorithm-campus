public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return helper(root, 1);
    }

    private int helper(TreeNode node, int count) {
        if (node == null) return count;
        if (node.left != null || node.right != null) {
            count++;
            int result = Math.max(helper(node.left, count), helper(node.right, count));
            return result;
        }
        return count;
    }
}
