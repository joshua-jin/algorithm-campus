package algorithm.lintcode.easy;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode lessIndex = header;
        ListNode iterator = header;
        while (iterator.next != null) {
            if (iterator.next.val < x) {
                if (lessIndex == iterator) {
                    iterator = iterator.next;
                } else {
                    moveNodeToBefore(lessIndex, iterator);
                }
                lessIndex = lessIndex.next;
            } else {
                iterator = iterator.next;
            }
        }
        return header.next;
    }

    private void moveNodeToBefore(ListNode lastLessNode, ListNode prevNode) {
        ListNode swapNode = prevNode.next;
        prevNode.next = swapNode.next;
        swapNode.next = lastLessNode.next;
        lastLessNode.next = swapNode;
    }
}
