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
     * @param x: an integer
     * @return: a ListNode 
     */
    ListNode *partition(ListNode *head, int x) {
        ListNode *firstStart = NULL;
        ListNode *firstEnd = NULL;
        ListNode *secondStart = NULL;
        ListNode *secondEnd = NULL;
        
        for (; head; head = head->next) {
            ListNode **start, **end;
            if (head->val < x) {
                start = &firstStart;
                end = &firstEnd;
            } else {
                start = &secondStart;
                end = &secondEnd;
            }
            
            if (*start == NULL) *start = *end = head;
            else {
                (*end)->next = head;
                *end = head;
            }
        }
        if (firstEnd != NULL)
            firstEnd->next = secondStart;
        if (secondEnd != NULL)
            secondEnd->next = NULL;
        return firstStart != NULL? firstStart : secondStart;
    }
};
