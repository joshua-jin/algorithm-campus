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
     * @return: Inorder in vector which contains node values.
     */
public:
    vector<int> inorderTraversal(TreeNode *root) {
        vector<int> vals;
        deque<TreeNode*> nodes;
        TreeNode* node = root;
        while (true) {
            while (node) {
                nodes.push_front(node);
                node = node->left;
            }
            if (nodes.empty()) break;
            node = nodes.front();
            nodes.pop_front();
            vals.push_back(node->val);
            node = node->right;
        }
        return vals;
    }
};
