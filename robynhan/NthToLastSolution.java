package org.robynhan.week9;

import org.robynhan.ListNode;

public class NthToLastSolution {
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if (head == null || n < 1) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head;
        for (int j = 0; j < n - 1; ++j) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
