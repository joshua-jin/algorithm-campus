package com.lintcode;

/**
 * @author : Joshua
 * Date:     3/9/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/merge-two-sorted-lists/">合并两个排序链表</a>
 */
public class MergeTwoSortedLists {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int val) {
              this.val = val;
              this.next = null;
          }
      }

    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode dummyNode = new ListNode(0);
        mergeNode(dummyNode, l1, l2);
        return dummyNode.next;
    }

    private void mergeNode(ListNode newListNode, ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return;
        }

        if (l1 == null) {
            newListNode.next = l2;
            return;
        }

        if (l2 == null) {
            newListNode.next = l1;
            return;
        }

        if (isL1GreaterThanL2(l1, l2)) {
            newListNode.next = l1;
            mergeNode(newListNode.next, l1.next, l2);
        } else {
            newListNode.next = l2;
            mergeNode(newListNode.next, l1, l2.next);
        }
    }

    private Boolean isL1GreaterThanL2(ListNode l1, ListNode l2) {
        if (l1.val <= l2.val) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
