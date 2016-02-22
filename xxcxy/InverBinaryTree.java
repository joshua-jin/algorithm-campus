package algorithm.lintcode.easy;

public class InverBinaryTree {
    public void invertBinaryTree(TreeNode root) {
        if (root != null) {
            TreeNode right = root.right;
            root.right = root.left;
            root.left = right;
            invertBinaryTree(root.right);
            invertBinaryTree(root.left);
        }
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
