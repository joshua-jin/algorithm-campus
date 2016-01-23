package com.lintcode;

/**
 * @author : Joshua
 * Date:     1/23/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/remove-linked-list-elements/">删除链表中的元素</a>
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        if (head == null || head.val == val) {
            return null;
        }
        for (ListNode node = head; node.next != null;) {
            if (node.next.val == val) {
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
