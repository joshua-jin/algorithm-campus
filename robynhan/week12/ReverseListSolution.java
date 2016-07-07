package org.robynhan.week12;

import org.robynhan.ListNode;

public class ReverseListSolution {
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
