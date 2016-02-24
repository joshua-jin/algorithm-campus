/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

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
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> paths;
        const std::function<void (TreeNode*, string)> walk = 
            [&walk, &paths](TreeNode* node, string path) {
                if (not node) return;
                path += std::to_string(node->val);
                if (node->left || node->right) {
                    path += "->";
                } else {
                    paths.emplace_back(std::move(path));
                }
                walk(node->left, path);
                walk(node->right, path);
            };
        walk(root, "");
        return paths;
    }
};
