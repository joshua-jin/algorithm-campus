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
        if (head == NULL) {
            return NULL;
        } else if (head->val == val) {
            return removeElements(head->next, val);
        } else {
            ListNode *next = removeElements(head->next, val);
            head->next = next;
            return head;
        }
    }
};
