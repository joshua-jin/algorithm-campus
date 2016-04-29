package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/24/16
 */
public class SwapNodesInPairs {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // Write your code here
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        swap(dummy, head);

        return dummy.next;
    }

    private void swap(ListNode previous, ListNode current) {
        if (current == null) {
            return;
        }
        ListNode next = current.next;
        if (next != null) {
            ListNode tmp = next.next;
            next.next = current;
            current.next = tmp;
            previous.next = next;
            swap(current, tmp);
        } else {
            return;
        }
    }
}
