public class BinaryTreePreorderTraversalRecursive {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.val);
            helper(list, root);
        }
        return list;
    }

    private void helper(ArrayList<Integer> list, TreeNode node) {
        if (node.right == null && node.left == null) {
            return;
        }
        if (node.left != null) {
            list.add(node.left.val);
            helper(list, node.left);
        }
        if (node.right != null) {
            list.add(node.right.val);
            helper(list, node.right);
        }
    }
}