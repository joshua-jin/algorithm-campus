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
    @return: Postorder in ArrayList which contains node values.
    """
    def postorderTraversal(self, root):
        # write your code here
        result = []
        self.post_order_traversal(root, result)
        return result

    def post_order_traversal(self, root, result):
        if root is None:
            return
        self.post_order_traversal(root.left, result)
        self.post_order_traversal(root.right, result)
        result.append(root.val)
