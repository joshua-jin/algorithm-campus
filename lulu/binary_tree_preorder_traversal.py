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
    @return: Preorder in ArrayList which contains node values.
    """
    def preorderTraversal(self, root):
        # write your code here
        result = []
        self.pre_order_traversal(root, result)
        return result

    def pre_order_traversal(self, root, result):
    	if root is None:
    		return
    	result.append(root.val)
    	self.pre_order_traversal(root.left, result)
    	self.pre_order_traversal(root.right, result)
