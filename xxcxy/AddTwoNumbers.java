package algorithm.lintcode.easy;

public class AddTwoNumbers {
    public ListNode addList(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
        ListNode head = new ListNode(val % 10);
        appendNode(val / 10, head, l1.next, l2.next);
        return head;
    }

    private void appendNode(final int carry, final ListNode target, final ListNode s1, final ListNode s2) {
        int val = carry + getVal(s1) + getVal(s2);
        if (s1 == null && s2 == null) {
            if (val > 0) {
                target.next = new ListNode(val % 10);
            }
        } else {
            target.next = new ListNode(val % 10);
            appendNode(val / 10, target.next, s1 == null ? null : s1.next, s2 == null ? null : s2.next);
        }
    }

    private int getVal(final ListNode node) {
        if (node != null) {
            return node.val;
        }
        return 0;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
