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
     * @return: The head of linked list.
     */
    ListNode *insertionSortList(ListNode *head) {
        if (head == NULL) return head;
        ListNode *min = head;
        for (ListNode *cur = head; cur; cur = cur->next)
            min = cur->val < min->val? cur : min;
        int temp = head->val;
        head->val = min->val;
        min->val = temp;
        insertionSortList(head->next);
        return head;
    }
};
