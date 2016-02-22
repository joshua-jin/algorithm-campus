package org.robynhan.week4;

import org.robynhan.ListNode;

public class DeleteNodeO1Solution {
    public void deleteNode(ListNode node) {
        // write your code here
        // 将下一个节点的数据(val + next)拷贝到当前节点, 然后删除下一个节点.
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
        next = null;
    }
}
