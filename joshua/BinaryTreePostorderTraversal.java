package com.lintcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : Joshua
 * Date:     2/1/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/binary-tree-postorder-traversal/">二叉树的后序遍历</a>
 */
public class BinaryTreePostorderTraversal {
    public static class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        if (root != null) {
            fillList(resultList, root);
        }
        return resultList;
    }

    private void fillList(ArrayList<Integer> treeNodeList, TreeNode node) {
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        TreeNode preNode = null;
        nodeStack.push(node);

        while (!nodeStack.isEmpty()) {
            node = nodeStack.peek();

            if ((node.left == null && node.right == null)
                    || (preNode != null && ((node.right == preNode)
                    || (node.left == preNode)))) {
                node = nodeStack.pop();
                treeNodeList.add(node.val);
                preNode = node;
            }
            else {
                if (node.right != null) {
                    nodeStack.push(node.right);
                }
                if (node.left != null) {
                    nodeStack.push(node.left);
                }
            }
        }
    }
}
