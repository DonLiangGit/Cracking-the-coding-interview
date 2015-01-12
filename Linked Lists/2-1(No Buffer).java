/* Cracking the coding interview
 * 2-1 
 * Remove duplicates from linked list
 * Two pointers(No buffer)
 * Parameter is head of linked list.
 */

public static void removeDuplicates(LinkedListNode node) {

	// Check the linked list is null or not
	if(node == null) return;

	LinkedListNode current = node;
	LinkedListNode runner = null;
	while(current != null) {
		runner = current; // this is really important for the logic
		while(runner.next != null) {
			if(runner.next.data == current.data) {
				runner.next =runner.next.next;
			} else {
				runner.next = runner.next;
			}
		}
		current= current.next;
	}

}

/*
 * Extension:
 * APIs: 
 * Note: 
 */