package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/8/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/remove-nth-node-from-end-of-list/">删除链表倒数第 n 个节点</a>
 */
public class RemoveNthNodeFromEndOfList {
     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int val) {
             this.val = val;
             this.next = null;
         }
     }
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int size = getRemoveIndex(dummy.next, n);
        return dummy.next;
    }

    private int getRemoveIndex(ListNode node, int n) {
        if (node == null) {
            return 0;
        }

        int removeIndex = getRemoveIndex(node.next, n) + 1;

        if (removeIndex == n + 1) {
            node.next = node.next.next;
        }

        return removeIndex;
    }

}
