package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/3/16
 */
public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        removeNodes(head);
        return dummyNode.next;
    }

    private static void removeNodes(ListNode head) {
        ListNode cNode = head;
        ListNode node = head;

        while (node.next != null) {
           if (node.next.val == cNode.val) {
               node = node.next;
           } else {
               cNode.next = node.next;
               cNode.next = cNode;
               node = node.next;
           }
        }

        if (node.val == cNode.val) {
            cNode.next = null;
        }
    }
}
