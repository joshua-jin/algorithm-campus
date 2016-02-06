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
    TreeNode *build(vector<int> &A, int start, int end) {
        int mid = (start+end) / 2;
        TreeNode *node = new TreeNode(A[mid]);
        if (start < mid) {
            node->left = build(A, start, mid - 1);
        }
        if (end > mid) {
            node->right = build(A, mid + 1, end);
        }
        return node;
    }
    TreeNode *sortedArrayToBST(vector<int> &A) {
        if (A.size() == 0) return NULL;
        return build(A, 0, A.size() - 1);
    }
};
