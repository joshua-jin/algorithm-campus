/**
 * Definition of TreeNode:
 * class TreeNode {
 * public:
 *     int val;
 *     TreeNode *left, *right;
 *     TreeNode(int val) {
 *         this->val = val;
 *         this->left = this->right = NULL;
 *     }
 * }
 */
class Solution {
public:
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    TreeNode *flattenAndReturnLast(TreeNode *node) {
        TreeNode *left = node->left;
        TreeNode *right = node->right;
        node->left = node->right = NULL;
        
        TreeNode *next = node;
        if (left) {
            next->right = left;
            next = flattenAndReturnLast(left);
        }
        if (right) {
            next->right = right;
            next = flattenAndReturnLast(right);
        }
        return next;
    }
    void flatten(TreeNode *root) {
        if (root) flattenAndReturnLast(root);
    }
};
