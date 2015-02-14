/* Cracking the coding interview
 * Pre-work 
 * Add Two Numbers
 *
 * Method: 
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode nodePointer1 = l1;
        ListNode nodePointer2 = l2;
        ListNode newListNode = new ListNode(0);
        ListNode newListHead = newListNode;

        int carry = 0;
        while(nodePointer1 != null || nodePointer2 != null) {
            if(nodePointer1 != null) {
                carry = carry + nodePointer1.val;
                nodePointer1 = nodePointer1.next;
            }
            if(nodePointer2 != null) {
                carry = carry + nodePointer2.val;
                nodePointer2 = nodePointer2.next;
            }
            newListNode.next = new ListNode(carry%10);
            newListNode = newListNode.next;
            carry = carry / 10;

        }

        if(carry == 1){
            newListNode.next = newListNode(1);
        }

        return newListHead.next;
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