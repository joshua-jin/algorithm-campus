package org.robynhan.week12;

import org.robynhan.ListNode;

public class RemoveNthFromEndSolution {

    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode inverse = head;

        int count = 0;
        while (current.next != null) {
            count++;

            current = current.next;
            if (count > n) {
                inverse = inverse.next;
            }
        }

        if (inverse == head) {
            head = head.next;
        } else {
            inverse.next = inverse.next.next;
        }

        return head;
    }


    ListNode removeNthFromEnd2(ListNode head, int n) {
        // write your code here
        if (remove(head, n) > 0) {
            return head.next;
        }

        return head;
    }

    private int remove(ListNode node, int n) {
        if (node.next == null) return 1;
        int rank;
        rank = remove(node.next, n) + 1;

        if (rank == n + 1) {
            node.next = node.next.next;
            return Integer.MIN_VALUE;
        }
        return rank;
    }
}
