package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/27/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/insert-node-in-a-binary-search-tree/">在二叉查找树中插入节点</a>
 */
public class InsertNodeIntoBinarySearchTree {

      public class TreeNode {
          public int val;
          public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }

    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
            return node;
        }
        insertNewNode(root, node);
        return root;
    }

    private TreeNode insertNewNode(TreeNode root, TreeNode node) {
        if (root.left == null && root.right == null) {
            if (root.val < node.val) {
                root.right = node;
                return root;
            }

            if (root.val > node.val) {
                root.left = node;
                return root;
            }
        }

        if (root.val < node.val) {
            if (root.right == null) {
                root.right = node;
                return root;
            }
            else {
                root.right = insertNewNode(root.right, node);
            }
        }

        if (root.val > node.val) {
            if (root.left == null) {
                root.left = node;
                return root;
            }
            else {
                root.left = insertNode(root.left, node);
            }
        }

        return root;
    }
}
