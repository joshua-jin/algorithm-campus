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
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    ListNode *mergeTwoLists(ListNode *l1, ListNode *l2) {
        ListNode *head = NULL;
        ListNode *curTail = NULL;
        
        while (l1 != NULL || l2 != NULL) {
            ListNode *next;
            if (l1 == NULL) {
                next = l2;
                l2 = l2->next;
            } else if (l2 == NULL || l1->val < l2->val) {
                next = l1;
                l1 = l1->next;
            } else {
                next = l2;
                l2 = l2->next;
            }
            if (head == NULL) {
                head = curTail = next;
                curTail->next = NULL;
            } else {
                curTail->next = next;
                curTail = next;
                curTail->next = NULL;
            }
        }
        return head;
    }
};
