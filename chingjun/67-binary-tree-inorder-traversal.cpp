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
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in vector which contains node values.
     */
public:
    void traverse(TreeNode *root, vector<int> &out) {
        if (!root) return;
        traverse(root->left, out);
        out.push_back(root->val);
        traverse(root->right, out);
    }
    vector<int> inorderTraversal(TreeNode *root) {
        vector<int> out;
        traverse(root, out);
        return out;
    }
};
