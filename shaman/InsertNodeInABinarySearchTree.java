public class InsertNodeInABinarySearchTree {
    public TreeNode insertNode(final TreeNode root, final TreeNode node) {
        if (root == null) return node;
        if (root.val > node.val) {
            root.left = insertNode(root.left, node);
        } else {
            root.right = insertNode(root.right, node);
        }
        return root;
    }
}