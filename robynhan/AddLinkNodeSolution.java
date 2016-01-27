package org.robynhan;

public class AddLinkNodeSolution {

    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = new ListNode(0);
        ListNode dummyHead = head;

        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        while (currentNode1 != null || currentNode2 != null) {
            int value = (currentNode1 == null ? 0 : currentNode1.val) + (currentNode2 == null ? 0 : currentNode2.val) + (head == null ? 0 : head.val);
            head.val = value % 10;
            if (currentNode1 != null) {
                currentNode1 = currentNode1.next;
            }
            if (currentNode2 != null) {
                currentNode2 = currentNode2.next;
            }
            if (value > 9) {
                head.next = new ListNode(1);
            } else if (currentNode1 != null || currentNode2 != null) {
                head.next = new ListNode(0);
            }
            head = head.next;
        }

        return dummyHead;
    }
}
