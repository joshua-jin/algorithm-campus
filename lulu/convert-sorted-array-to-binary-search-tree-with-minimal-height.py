"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""
class Solution:
    """
    @param A: a list of integer
    @return: a tree node
    """
    def sortedArrayToBST(self, A):
        # write your code here
        if len(A) == 0:
            return None
        mid = len(A) / 2
        node = TreeNode(A[mid])
        node.left = self.sortedArrayToBST(A[:mid])
        node.right = self.sortedArrayToBST(A[(mid+1):])
        
        return node
        
    
