/**
 * http://www.lintcode.com/zh-cn/problem/remove-linked-list-elements/
 * http://www.code123.cc/docs/leetcode-notes/basics_data_structure/linked_list.html
 * http://www.programcreek.com/2014/04/leetcode-remove-linked-list-elements-java/
 */
public class RemoveLinkedListElements {
    // dummy node 
    public ListNode removeElements(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode point = helper;
        while(point.next != null) {
            if (point.next.val == val) {
                point.next = point.next.next;
            } else {
                point = point.next;
            }
        }
        return helper.next;
    }
    
    // recursion
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);

        if (head.val == val) {
            return head.next;
        }
        return head;
    }
}
