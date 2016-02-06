package algorithm.lintcode.easy;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTreeWithMinimalHeight {
    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        if (A.length == 0) {
            return null;
        }
        if (A.length == 1) {
            return new TreeNode(A[0]);
        }
        int mid = A.length / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(A, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(A, mid + 1, A.length));
        return root;
    }

    class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
}
