"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        this.val = val
        this.left, this.right = None, None
"""
class Solution:
    # @param root: a TreeNode, the root of the binary tree
    # @return: nothing
    def flatten(self, root):
        # write your code here
        self.preorder_traverse(root, None)
        
    def preorder_traverse(self, root, next):
        if root == None:
            return
        if root.left != None:
            mynext = root.left
        elif root.right != None:
            mynext = root.right
        else:
            mynext = next
        self.preorder_traverse(root.left, root.right if root.right != None else next)
        self.preorder_traverse(root.right, next) 
        root.left = None
        root.right = mynext
        
        
