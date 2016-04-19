package algorithm.lintcode.easy;

public class Subtree {
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if (isIdentical(T1, T2)) {
            return true;
        }
        if (T1 == null) {
            return false;
        }
        return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
    }

    private boolean isIdentical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (((t1 == null) ^ (t2 == null)) || t1.val != t2.val) {
            return false;
        }
        return isIdentical(t1.left, t2.left) && isIdentical(t1.right, t2.right);
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
