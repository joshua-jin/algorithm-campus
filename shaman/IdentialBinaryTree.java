public class IdentialBinaryTree {
    public boolean isIdentical(TreeNode a, TreeNode b) {
        return helper(a, b);
    }

    private boolean helper(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if ((a == null && b != null) || (a != null && b == null)) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        }
        return helper(a.left, b.left) && helper(a.right, b.right);
    }
}