/* Cracking the coding interview
 * 2-2
 * Find kth lase element in a linked list
 */

public LinkedListNode findKthElement(LinkedListNode head, int k) {

	private int listLength = countLinkedList(head);
	if(listLength == 0 || k > listLength) return null;

	private LinkedListNode slower = head;
	private LinkedListNode runner = head;
	private int count = 1;

	while(count != k) {
		runner = runner.next;
		count ++;
	}

	while(runner.next != null) {
		runner = runner.next;
		slower = slower.next
	}

	return slower;
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