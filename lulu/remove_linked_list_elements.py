# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    # @param head, a ListNode
    # @param val, an integer
    # @return a ListNode

    # Non-recursive way
    def removeElements(self, head, val):
        # Write your code here
        i = head
        while i is not None:
            if i.val != val:
                head = i
                break
            i = i.next
        if i is None:
            return None
        former = head
        i = head.next
        while i is not None:
            if i.val == val:
                former.next = i.next
            else:
                former = i
            i = i.next
        return head

    # Recursive way
    def removeElements(self, head, val):
        if head is None:
            return None
        if head.val == val:
            return self.removeElements(head.next, val)
        head.next = self.removeElements(head.next, val)
        return head
