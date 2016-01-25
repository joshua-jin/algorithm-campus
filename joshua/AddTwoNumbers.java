package com.lintcode;

/**
 * @author : Joshua
 * Date:     1/25/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/add-two-numbers/">链表求和</a>
 */
public class AddTwoNumbers {

    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode dummyNode = new ListNode(0);
        addListNode(l1, l2, dummyNode, 0);
        return dummyNode.next;
    }

    private void addListNode(ListNode l1, ListNode l2, ListNode resultNode, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return;
        }

        int l1Value = l1 == null ? 0 : l1.val;
        int l2Value = l2 == null ? 0 : l2.val;
        int resultValue = l1Value + l2Value + carry;

        resultNode.next = new ListNode(resultValue > 9 ? getSingleNumberValue(resultValue) : resultValue);
        addListNode(l1 == null ? null : l1.next,
                    l2 == null ? null :l2.next,
                    resultNode.next,
                    resultValue > 9 ? 1 : 0);
    }

    private int getSingleNumberValue(int resultValue) {
        String resultValueStr = Integer.toString(resultValue);
        return Integer.parseInt(resultValueStr.substring(resultValueStr.length() - 1));
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}