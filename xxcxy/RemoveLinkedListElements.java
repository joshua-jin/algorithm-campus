/**
 * Definition for singly-linked list.
*/
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
public class RemoveLinkedListElements {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        head = toConformLocation(head, val);
        if(head == null) {
            return null;
        }
        ListNode outcome = new ListNode(head.val);
        ListNode next = outcome;
        while(head.next != null) {
            if(head.next.val != val){
                next = appendNode(next, head.next.val);
            }
            head = head.next;
        }
        return outcome;
    }
    
    private ListNode toConformLocation(ListNode head, int val) {
        while(head !=null && head.val == val) {
            head = head.next;
        }
        return head;
    }
    
    private ListNode appendNode(ListNode last, int val) {
        ListNode current = new ListNode(val);
        if(last != null) {
            last.next = current;
        }
        return current;
    }
}
