public class InsertionSortListRecursion {
    // Recursion
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return head;
        ListNode min = head;
        for (ListNode cur = head; cur != null; cur = cur.next)
            min = cur.val < min.val ? cur : min;
        int temp = head.val;
        head.val = min.val;
        min.val = temp;
        insertionSortList(head.next);
        return head;
    }
    
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        while (head != null) {
            ListNode cur = dummy;
            while (cur.next != null && cur.next.val < head.val)
                cur = cur.next;
            ListNode tmp = head.next;
            head.next = cur.next;
            cur.next = head;
            head = tmp;
        }
        return dummy.next;
    }
}