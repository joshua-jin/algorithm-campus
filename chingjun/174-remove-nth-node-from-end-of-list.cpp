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
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode *removeNthFromEnd(ListNode *head, int n) {
        ListNode *start = head;
        ListNode *iter = head;
        for (int i = 0; i < n + 1; i++) {
            if (iter == NULL) {
                return start->next;
            }
            iter = iter->next;
        }
        
        while (iter != NULL) {
            iter = iter->next;
            head = head->next;
        }
        
        head->next = head->next->next;
        
        return start;
    }
};


