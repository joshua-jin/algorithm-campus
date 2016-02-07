public class ReverseListNode {

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode pCur = head.next;
        dummy.next = head;
        while (pCur != null) {
            head.next = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = head.next;
        }
        return dummy.next;
    }

    public ListNode anotherReverse(ListNode head) {
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