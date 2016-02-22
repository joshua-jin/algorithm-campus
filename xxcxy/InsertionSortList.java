package algorithm.lintcode.easy;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode emptyHead = new ListNode(-1);
        insertionSortList(emptyHead, head);
        return emptyHead.next;
    }

    private void insertionSortList(ListNode head, ListNode newNode) {
        if (newNode == null) {
            return;
        }
        ListNode insertPos = head;
        while (insertPos.next != null && insertPos.next.val < newNode.val) {
            insertPos = insertPos.next;
        }
        ListNode nextInsertNode = newNode.next;
        newNode.next = insertPos.next;
        insertPos.next = newNode;
        insertionSortList(head, nextInsertNode);
    }
}
