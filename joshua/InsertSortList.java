package com.lintcode;

/**
 * @author : Joshua
 * Date:     2/27/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/insertion-sort-list/">链表插入排序</a>
 */
public class InsertSortList {

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
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }

        ListNode boardNode = head.next;
        head.next = null;

        while (boardNode != null) {
            ListNode tmp  = boardNode;
            boardNode = boardNode.next;
            tmp.next = null;
            head = sortListNode(head, tmp);
        }
        return head;
    }

    private ListNode sortListNode(ListNode head, ListNode boardNode) {
        if (boardNode.val <= head.val) {
            boardNode.next = head;
            return boardNode;
        }

        ListNode currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.val < boardNode.val) {
                currentNode = currentNode.next;
                continue;
            } else {
                boardNode.next = currentNode.next;
                currentNode.next = boardNode;
                break;
            }
        }

        if (currentNode.next == null && currentNode.val < boardNode.val) {
            currentNode.next = boardNode;
        }

        return head;
    }
}
