package algorithm.lintcode.easy;

public class RemoveNthNodeFromEndOfList {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode emptyHead = new ListNode(0);
        emptyHead.next = head;
        ListNode target = emptyHead;
        ListNode pos = moveRight(emptyHead, n);
        while (isNotLastNode(pos)) {
            target = target.next;
            pos = pos.next;
        }
        removeNextNode(target);
        return emptyHead.next;
    }

    private ListNode moveRight(ListNode currentNode, int n) {
        ListNode target = currentNode;
        for (int i = 0; i < n; i++) {
            target = target.next;
        }
        return target;
    }

    private boolean isNotLastNode(ListNode node) {
        return node.next != null;
    }

    private void removeNextNode(ListNode currentNode) {
        currentNode.next = currentNode.next.next;
    }
}
