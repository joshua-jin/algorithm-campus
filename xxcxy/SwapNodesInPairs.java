package algorithm.lintcode.easy;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head != null) {
            swap(head, head.next);
        }
        return head;
    }

    private void swap(ListNode first, ListNode next) {
        if (first != null && next != null) {
            int val = first.val;
            first.val = next.val;
            next.val = val;
            if (next.next != null) {
                swap(next.next, next.next.next);
            }
        }
    }
}
