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
    /**
     * @param root: The root of binary tree.
     * @return: Postorder in vector which contains node values.
     */
public:
    vector<int> postorderTraversal(TreeNode *root) {
        vector<int> vals;
        deque<TreeNode*> nodes = { root };
        while (!nodes.empty()) {
            const auto node = nodes.front();
            nodes.pop_front();
            if (not node) continue;
            vals.insert(vals.begin(), node->val);
            nodes.push_front(node->left);
            nodes.push_front(node->right);
        }
        return vals;
    }
};
