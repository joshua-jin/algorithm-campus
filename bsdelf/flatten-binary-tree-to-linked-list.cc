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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    void flatten(TreeNode *root) {
        const auto not_left_flatten = [](TreeNode* node) -> bool {
            for (auto iter = node; iter; iter = iter->left) {
                if (iter->right) return true;
            }
            return false;
        };
        while (not_left_flatten(root)) {
            TreeNode* last = nullptr, * fork = nullptr;
            for (auto iter = root; iter; last = iter, iter = iter->left) {
                if (iter->right) fork = iter;
            }
            last->left = fork->right;
            fork->right = nullptr;
        }
        for (auto iter = root; iter; iter = iter->right) {
            iter->right = iter->left;
            iter->left = nullptr;
        }
    }
};
