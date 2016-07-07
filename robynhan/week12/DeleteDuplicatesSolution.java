package org.robynhan.week12;

import org.robynhan.ListNode;

public class DeleteDuplicatesSolution {
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null) return null;
        ListNode currentNode = head;
        while (currentNode.next != null) {
            if(currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            }else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
