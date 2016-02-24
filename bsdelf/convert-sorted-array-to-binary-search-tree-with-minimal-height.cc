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
     * @param A: A sorted (increasing order) array
     * @return: A tree node
     */
    TreeNode *sortedArrayToBST(vector<int> &A) {    
        TreeNode* root = nullptr;
        make_bst(root, A, 0, A.size());
        return root;
    }
    
private:
    void make_bst(TreeNode*& root, const vector<int>& arr, int begin, int end) {
        if (begin >= end) return;
        const int mid = (begin + end) / 2;
        root = new TreeNode(arr[mid]);
        make_bst(root->left, arr, begin, mid);
        make_bst(root->right, arr, mid + 1, end);
    }
};
