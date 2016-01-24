package com.lintcode;

/**
 * @author : Joshua
 * Date:     1/23/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/remove-linked-list-elements/">删除链表中的元素</a>
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        if (head == null) {
            return null;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        removeNode(dummyNode, val);
        return dummyNode.next;
    }

    private void removeNode(ListNode node, int val) {
        if (node.next == null) {
            return;
        }

        if (node.next.val == val) {
            node.next = node.next.next;
        }
        else {
            node = node.next;
        }
        removeNode(node, val);
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
