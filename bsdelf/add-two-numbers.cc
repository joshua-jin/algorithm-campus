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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    ListNode *addLists(ListNode *l1, ListNode *l2) {
        ListNode* head = nullptr, * parent = nullptr;
        int carry = 0;
        while (l1 || l2) {
            const int a = l1 ? l1->val : 0;
            const int b = l2 ? l2->val : 0;
            const int sum = a + b + carry;
            const int rem = sum % 10;
            carry = sum / 10;
            auto cursor = new ListNode(rem);
            if (parent) {
                parent->next = cursor;
                parent = cursor;
            } else {
                head = parent = cursor;
            }
            if (l1) l1 = l1->next;
            if (l2) l2 = l2->next;
        }
        if (carry > 0) {
            auto cursor = new ListNode(carry);
            parent->next = cursor;
        }
        return head;
    }
};
