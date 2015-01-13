/* Cracking the coding interview
 * 2-7 (Beginner)
 * Check Palindrome linked list
 * Reverse a linked list.
 */

public static boolean isPalindrome(LinkedListNode node) {

	// Initialize the reversed linked list
	public LinkedListNode reverseHead = null;
	reverseLinkedList(node);
	reverseHead = head;

	while(node != null) {

		if(node.data != head.data) return false;

		node = node.next;
		head = head.next;
	}
	return true;

}

/* Recursion to reverse the linked list */
public void reverseLinkedList(LinkedListNode node) {

	if(node == null) {
		return;
	}
	if(node.next == null) {
		head = node;
		return;
	}

	reverseLinkedList(node.next);
	node.next.next = node;
	node.next = null;
}

public class GlobalVariant {
	public LinkedListNode head;
}
/*
 * Extension:
 * APIs: 
 * Note: 
 */