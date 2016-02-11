package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/8/16
 * @see <a href>在 O(1) 的时间复杂度删除链表节点</a>
 */
public class DeleteListNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        ListNode t = node.next;
        node.val = node.next.val;
        node.next = node.next.next;
        t.next = null;
    }
}
