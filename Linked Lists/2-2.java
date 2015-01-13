/* Cracking the coding interview
 * 2-2
 * Find kth lase element in a linked list
 */

public LinkedListNode findKthElement(LinkedListNode head, int k) {

	private int listLength = countLinkedList(head);
	

}

public int countLinkedList(LinkedListNode head) {

	private int count = 0;
	if(head == null) return count;

	count = 1;
	while(head.next != null) {
		count ++;
		head = head.next;
	}
	return count;
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */