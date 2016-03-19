package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/13/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/nth-to-last-node-in-list/">链表倒数第n个节点</a>
 */
public class NthToLastNodeInList {
      public class ListNode {
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
     * @return: Nth to last node of a singly linked list.
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if (head == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode node = reverseList(head, next);
        for (int i = 0; i < n - 1; i++) {
            if (node != null && node.next != null) {
                node = node.next;
            }
            node = null;
        }
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
