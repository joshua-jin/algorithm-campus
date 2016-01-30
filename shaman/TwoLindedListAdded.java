public class TwoLinkedListAdded {
    public ListNode addLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode point = head;

        while (l1 != null || l2 != null) {
            int val = getVal(l1) + getVal(l2) + getVal(point);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (val > 9) {
                point.next = new ListNode(1);
            } else if (l1 != null || l2 != null) {
                point.next = new ListNode(0);
            }
            point = point.next;
        }

        return head;
    }

    private int getVal(ListNode node) {
        return node == null ? 0 : node.val;
    }
}