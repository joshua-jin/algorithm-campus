package algorithm.lintcode.easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode emptyHead = new ListNode(-1);
        emptyHead.next = l1;
        merge(emptyHead, l2);
        return emptyHead.next;
    }

    private void merge(ListNode l1, ListNode l2) {
        if (l2 == null) {
            return;
        }
        ListNode pos = l1;
        while (pos.next != null && pos.next.val < l2.val) {
            pos = pos.next;
        }
        ListNode nextInsertNode = l2.next;
        l2.next = pos.next;
        pos.next = l2;
        merge(l1, nextInsertNode);
    }
}
