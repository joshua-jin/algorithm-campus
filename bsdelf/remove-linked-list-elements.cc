/**
 * @author      Yanhui Shen
 * @version     1.0
 * @since       2016-02-11 
 */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    ListNode *removeElements(ListNode *head, int val) {
        auto cursor = head;
        auto parent = static_cast<ListNode*>(nullptr);
        while (cursor) {
            if (cursor->val != val) {
                parent = cursor;
                cursor = cursor->next;
                continue;
            }
            auto next = cursor->next;
            if (next) {
                cursor->val = next->val;
                cursor->next = next->next;
                delete next;
            } else {
                delete cursor;
                if (head == cursor) head = nullptr;
                if (parent) parent->next = nullptr;
                break;
            }
        }
        return head;
    }
};
