package algorithm.lintcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BinaryTreePaths {

    static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        Set<String> result = new HashSet<>();
        if (root != null) {
            result.add(String.valueOf(root.val));
            if (root.left != null || root.right != null) {
                result = union(appendNode(root.left, result),
                        appendNode(root.right, result));
            }
        }
        return new ArrayList<>(result);
    }

    private Set<String> appendNode(TreeNode node, Set<String> original) {
        if (node == null) {
            return new HashSet<>();
        }
        Set<String> set = new HashSet<>(original.size());
        for (String path : original) {
            set.add(path + "->" + node.val);
        }
        if (node.left == null && node.right == null) {
            return set;
        }
        return union(appendNode(node.left, set), appendNode(node.right, set));
    }

    private Set<String> union(final Set<String> s1, final Set<String> s2) {
        Set<String> result = new HashSet<>(s1.size() + s2.size());
        result.addAll(s1);
        result.addAll(s2);
        return result;
    }
}
