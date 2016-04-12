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
     * @return: head node
     */
    ListNode *deleteDuplicates(ListNode *head) {
        ListNode *start = head;
        ListNode *end = head;
        
        if (head) head = head->next;
        while (head) {
            if (head->val != end->val) {
                end->next = head;
                end = head;
            }
            head = head->next;
        }
        
        if (end) end->next = NULL;
        return start;
    }
};
