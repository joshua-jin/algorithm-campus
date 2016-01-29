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
    ListNode *addLists2(ListNode *l1, ListNode *l2, int carry, ListNode *bak) {
        if (l1 == NULL) {
            if (l2 == NULL) {
                if (carry) {
                    bak->val = carry;
                    bak->next = NULL;
                    return bak;
                } else {
                    return NULL;
                }
            } else {
                l2->val += carry;
                return l2;
            }
        } else {
            if (l2 == NULL) {
                l1->val += carry;
                return l1;
            } else {
                l1->val += l2->val + carry;
                int next_carry = 0;
                if (l1->val >= 10) {
                    l1->val -= 10;
                    next_carry = 1;
                }
                l1->next = addLists2(l1->next, l2->next, next_carry, bak);
                return l1;
            }
        }
    }
    ListNode *addLists(ListNode *l1, ListNode *l2) {
        return addLists2(l1, l2, 0, l2);
    }
};
