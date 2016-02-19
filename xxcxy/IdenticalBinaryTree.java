package algorithm.lintcode.easy;

public class IdenticalBinaryTree {
    public boolean isIdentical(TreeNode a, TreeNode b) {
        if (a == null || b == null) {
            if (a != null || b != null) {
                return false;
            }
            return true;
        }
        if (a.val != b.val) {
            return false;
        }
        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
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
