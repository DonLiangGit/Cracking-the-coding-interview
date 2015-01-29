/* Cracking the coding interview
 * Pre-work 
 * Remove Duplicates from Sorted List
 *
 * Method: 
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode sp = head;
        ListNode fp = head.next;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        while(fp != null) {
            if(sp.val == fp.val) {
                sp.next = fp.next;
                fp = fp.next;
            } else {
                sp = sp.next;
                fp = fp.next;
            }
        }

        return dummyNode.next;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */