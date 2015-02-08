/* Cracking the coding interview
 * Pre-work 
 * Intersection of Two Linked List
 *
 * Method: 
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int listALength = 0;
        int listBLength = 0;
        ListNode dummyHead = headA;

        while(dummyHead != null) {
            listALength++;
            dummyHead = dummyHead.next;
        }
        dummyHead = headB;
        while(dummyHead != null) {
            listBLength++;
            dummyHead = dummyHead.next;
        }

        int diff = Math.abs(listALength - listBLength);
        ListNode headFlag = null;
        if(listALength >= listBLength ) {
            dummyHead = headA;
            headFlag = headB;
        } else {
            dummyHead = headB;
            headFlag = headA;
        }
        for(int i = 0; i < diff; i++) {
            dummyHead = dummyHead.next;
        }

        while(dummyHead != null) {
            if(dummyHead == headFlag) {
                return dummyHead;
            }
            headFlag = headFlag.next;
            dummyHead = dummyHead.next;
        }
        return null;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */