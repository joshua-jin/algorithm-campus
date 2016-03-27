public class InvertBinaryTree {
    public void invertBinaryTree(final TreeNode root) {
        if (root == null) return;
        if (root.left != null) invertBinaryTree(root.left);
        if (root.right != null) invertBinaryTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}