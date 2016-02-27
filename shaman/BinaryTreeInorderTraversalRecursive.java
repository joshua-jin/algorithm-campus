public class BinaryTreeInorderTraversalRecursive {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            helper(root);
        }

        return result;
    }

    private void helper(TreeNode p) {
        if (p.left != null)
            helper(p.left);

        result.add(p.val);

        if (p.right != null)
            helper(p.right);
    }
}