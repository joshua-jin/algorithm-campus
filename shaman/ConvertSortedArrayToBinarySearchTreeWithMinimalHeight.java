public class ConvertSortedArrayToBinarySearchTreeWithMinimalHeight {

    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        return helper(A, 0, A.length - 1);
    }

    public TreeNode helper(int[] A, int low, int high) {
        if (low > high) {
            return null;
        }
        TreeNode root = new TreeNode(A[(low + high) / 2]);
        root.left = helper(A, low, (low + high) / 2 - 1);
        root.right = helper(A, (low + high) / 2 + 1, high);
        return root;
    }
}