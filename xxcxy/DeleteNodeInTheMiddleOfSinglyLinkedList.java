package algorithm.lintcode.easy;

public class DeleteNodeInTheMiddleOfSinglyLinkedList {
    public void deleteNode(ListNode node) {
        // write your code here
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
