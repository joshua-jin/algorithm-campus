package org.robynhan;

public class LinkedListSolution {
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        ListNode current = head;
        ListNode before = null;
        ListNode newHead = null;
        while (current != null) {
            if (current.val == val) {
                if (before != null) {
                    before.next = current.next;
                    current = before;
                }
            } else if (newHead == null) {
                newHead = current;
            }
            before = current;
            current = current.next;
        }

        return newHead;
    }
}
