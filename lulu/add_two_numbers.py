# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    # @param l1: the first list
    # @param l2: the second list
    # @return: the sum list of l1 and l2
    def addLists(self, l1, l2):
        head = l1
        carry = 0
        # write your code here
        while l1 is not None and l2 is not None:

            l1.val += l2.val + carry
            carry = l1.val / 10
            l1.val = l1.val % 10
            if l1.next is None and l2.next is not None:
                l1.next = ListNode(0)
            last = l1
            l1 = l1.next

            if l2.next is None and l1 is not None:
                l2.next = ListNode(0)
            l2 = l2.next
        if carry == 1:
            last.next = ListNode(1)

        return head
