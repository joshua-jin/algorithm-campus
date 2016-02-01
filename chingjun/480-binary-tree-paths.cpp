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
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    void findPaths(TreeNode *root, const string &currentPath, vector<string> &out) {
        if (!root) return;
        string path = currentPath;
        if (path.length() > 0) {
            path += "->";
        }
        path += to_string(root->val);
        if (!root->left && !root->right) {
            out.push_back(path);
        } else {
            findPaths(root->left, path, out);
            findPaths(root->right, path, out);
        }
    }
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> out;
        string path = "";
        findPaths(root, path, out);
        return out;
    }
};
