package algorithm.lintcode.easy;

public class InsertNodeInABinarySearchTree {
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        if (root == null) {
            return node;
        }
        TreeNode searchNode = root;
        while (true) {
            if (searchNode.val < node.val) {
                if (searchNode.right == null) {
                    searchNode.right = node;
                    return root;
                } else {
                    searchNode = searchNode.right;
                }
            } else {
                if (searchNode.left == null) {
                    searchNode.left = node;
                    return root;
                } else {
                    searchNode = searchNode.left;
                }
            }
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
