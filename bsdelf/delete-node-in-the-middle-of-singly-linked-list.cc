/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

/**
 * Definition of ListNode
 * class ListNode {
 * public:
 *     int val;
 *     ListNode *next;
 *     ListNode(int val) {
 *         this->val = val;
 *         this->next = NULL;
 *     }
 * }
 */
class Solution {
public:
    /**
     * @param node: a node in the list should be deleted
     * @return: nothing
     */
    void deleteNode(ListNode *node) {
        const auto next = node->next;
        node->val = next->val;
        node->next = next->next;
        delete next;
    }
};
