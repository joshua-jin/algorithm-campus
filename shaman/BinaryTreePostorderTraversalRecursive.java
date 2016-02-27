public class BinaryTreePostorderTraversalRecursive {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            helper(root);
        }

        return result;
    }

    private void helper(TreeNode p) {
        if (p.left != null)
            helper(p.left);

        if (p.right != null)
            helper(p.right);

        result.add(p.val);
    }
}