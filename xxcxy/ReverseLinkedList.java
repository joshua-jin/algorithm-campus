package algorithm.lintcode.easy;

public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode currentNode = head;
        ListNode newHead = null;
        ListNode nextNode;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = newHead;
            newHead = currentNode;
            currentNode = nextNode;
        }
        return newHead;
    }
}
