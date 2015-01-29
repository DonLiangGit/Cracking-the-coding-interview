/* Cracking the coding interview
 * Pre-work 
 * Linked List Cycle
 *
 * Method: 
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }

        ListNode sp = head;
        ListNode fp = head.next;
        while(fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if(fp == sp) {
                return true;
            }
        }

        return false;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */