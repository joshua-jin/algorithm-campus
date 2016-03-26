package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/25/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/partition-list/">链表划分</a>
 */
public class PartitionList {
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
     * @param x: an integer
     * @return: a ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        ListNode little = new ListNode(0);
        ListNode ol = little;
        ListNode great = new ListNode(0);
        ListNode og = great;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        while (dummy.next != null) {
            if (dummy.next.val <= x) {
                little.next = new ListNode(dummy.next.val);
                little = little.next;
            } else {
                great.next = new ListNode(dummy.next.val);
                great = great.next;
            }
            dummy = dummy.next;
        }

        little.next = og.next;
        return ol.next;
    }
}
