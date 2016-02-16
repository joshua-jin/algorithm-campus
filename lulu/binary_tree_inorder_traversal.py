"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""


class Solution:
    """
    @param root: The root of binary tree.
    @return: Inorder in ArrayList which contains node values.
    """
    def inorderTraversal(self, root):
        # write your code here
        result = []
        self.in_order_traversal(root, result)
        return result

    def in_order_traversal(self, root, result):
        if root is None:
            return
        self.in_order_traversal(root.left, result)
        result.append(root.val)
        self.in_order_traversal(root.right, result)
