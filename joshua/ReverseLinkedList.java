package com.lintcode;

/**
 * @author : Joshua
 * @see <a href="http://www.lintcode.com/zh-cn/problem/reverse-linked-list/">翻转链表</a>
 * Date:     4/8/16
 */
public class ReverseLinkedList {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode node = reverseList(head, next);
        return node;
    }


    private ListNode reverseList(ListNode node, ListNode next) {
        while (next != null) {
            ListNode tmp = next.next;
            ListNode tmpCurrent = node;
            next.next = tmpCurrent;
            node = next;
            next = tmp;
        }
        return node;
    }
}
