package algorithm.lintcode.easy;

import java.util.ArrayList;

public class BinaryTreeInorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class LinkedTreeNode {
        TreeNode val;
        LinkedTreeNode prev;
        LinkedTreeNode next;
        boolean done;

        static LinkedTreeNode insertTreeNode(TreeNode treeNode,
                                             LinkedTreeNode prev,
                                             LinkedTreeNode next) {
            if (treeNode == null) {
                return null;
            }
            LinkedTreeNode linkedTreeNode = new LinkedTreeNode();
            linkedTreeNode.val = treeNode;
            if (prev != null) {
                linkedTreeNode.prev = prev;
                prev.next = linkedTreeNode;
            }
            if (next != null) {
                linkedTreeNode.next = next;
                next.prev = linkedTreeNode;
            }
            return linkedTreeNode;
        }
    }

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        LinkedTreeNode linkedTreeNode = LinkedTreeNode.insertTreeNode(root, null, null);
        LinkedTreeNode lastNode = linkedTreeNode;
        while (linkedTreeNode != null) {
            if (linkedTreeNode.done) {
                lastNode = linkedTreeNode;
                linkedTreeNode = linkedTreeNode.next;
            } else {
                linkedTreeNode.done = true;
                LinkedTreeNode.insertTreeNode(linkedTreeNode.val.left, linkedTreeNode, linkedTreeNode.next);
                LinkedTreeNode right = LinkedTreeNode
                        .insertTreeNode(linkedTreeNode.val.right, linkedTreeNode.prev, linkedTreeNode);
                if (right != null) {
                    linkedTreeNode = right;
                } else {
                    lastNode = linkedTreeNode;
                    linkedTreeNode = linkedTreeNode.next;
                }
            }
        }
        while (lastNode != null) {
            result.add(lastNode.val.val);
            lastNode = lastNode.prev;
        }
        return result;
    }
}