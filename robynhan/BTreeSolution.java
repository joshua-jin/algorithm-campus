package org.robynhan;

import java.util.ArrayList;
import java.util.List;

public class BTreeSolution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    private void preorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        preorderTraversal(node.left, result);
        preorderTraversal(node.right, result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, result);
        result.add(node.val);
        inorderTraversal(node.right, result);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }

    private void postorderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left, result);
        postorderTraversal(node.right, result);
        result.add(node.val);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        binaryTreePaths(root, String.valueOf(root.val), result);
        return result;
    }

    private void binaryTreePaths(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        if(node.left!=null) {
            binaryTreePaths(node.left, path + "->" + String.valueOf(node.left.val), result);
        }
        if(node.right!=null) {
            binaryTreePaths(node.right, path + "->" + String.valueOf(node.right.val), result);
        }
    }
}
