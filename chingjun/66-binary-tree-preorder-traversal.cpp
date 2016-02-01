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
     * @param root: The root of binary tree.
     * @return: Preorder in vector which contains node values.
     */
    void traverse(TreeNode *root, vector<int> &out) {
        if (!root) return;
        out.push_back(root->val);
        traverse(root->left, out);
        traverse(root->right, out);
    }
    vector<int> preorderTraversal(TreeNode *root) {
        vector<int> out;
        traverse(root, out);
        return out;
    }
};
