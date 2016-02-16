"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""
class Solution:
    # @param {TreeNode} root the root of the binary tree
    # @return {List[str]} all root-to-leaf paths
    def binaryTreePaths(self, root):
        # Write your code here
        if root is None:
            return []
        paths = []
        path = ''
        self.find_path(root, paths, path)
        return paths


    def find_path(self, root, paths, path):
        if root.left is None and root.right is None:
            path += str(root.val)
            paths.append(path)
        else:
            path += str(root.val) + '->'
            if root.left is not None:
                self.find_path(root.left, paths, path)
            if root.right is not None:
                self.find_path(root.right, paths, path)
