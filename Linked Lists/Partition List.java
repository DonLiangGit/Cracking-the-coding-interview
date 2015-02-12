/* Cracking the coding interview
 * Pre-work 
 * Partition List
 *
 * Method: 
 */

public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return null;
        }

        ListNode dummyNode1 = new ListNode(0);
        ListNode dummyNode2 = new ListNode(0);
        dummyNode1.next = head;

        ListNode p = head;           // p is a iterator pointer
        ListNode prev = dummyNode1; // prev is a pointer to link < x
        ListNode p2 = dummyNode2;   // p2 is a pointer to link > x

        while(p != null) {
            if(p.val < x) {
                p = p.next;
                prev = prev.next;
            } else {
                p2.next = p;        // link the bigger element;
                prev.next = p.next; // skip the current bigger element

                p = prev.next;      // point to next for next round;
                p2 = p2.next;
            }
        }
        p2.next = null;             // reset the list end
        prev.next = dummyNode2.next;      // link to partitioned list
        return dummyNode1.next;
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*
 * Extension:
 * APIs: 
 * Note: 
 */