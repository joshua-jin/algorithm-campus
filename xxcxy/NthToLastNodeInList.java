package algorithm.lintcode.easy;

public class NthToLastNodeInList {
    ListNode nthToLast(ListNode head, int n) {
        ListNode target = head;
        ListNode afterN = moveRight(head, n);
        while (afterN != null && afterN.next != null) {
            afterN = afterN.next;
            target = target.next;
        }
        return target;
    }

    private ListNode moveRight(ListNode currentNode, int n) {
        ListNode targetNode = currentNode;
        for (int i = 0; i < n - 1; i++) {
            targetNode = targetNode.next;
        }
        return targetNode;
    }
}
