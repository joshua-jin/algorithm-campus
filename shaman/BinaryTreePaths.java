public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        String list = "";
        if (root != null)
            list = list + root.val;
        helper(root, result, list);
        return result;
    }

    private void helper(TreeNode root, List<String> result, String lst) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            result.add(lst);
            return;
        }
        if (root.left != null)
            helper(root.left, result, lst + "->" + root.left.val);
        if (root.right != null)
            helper(root.right, result, lst + "->" + root.right.val);
    }
}
