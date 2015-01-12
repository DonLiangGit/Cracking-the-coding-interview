/* Cracking the coding interview
 * 2-6 (Beginner)
 * Check if there is a loop in a linked list.
 * Supposed we have known the head of linked list.
 */

public static boolean isLinkedlistLoop(LinkedListNode node) {

	// If there is no node return false;
	if(node == null || node.next == null) {
		return false;
	}

	// Else set the runner and the slower.
	// Then the runner walk two steps each time.
	private LinkedListNode slower = node;
	private LinkedListNode runner = node;
	while(runner.next != null) {
		if(runner == slower) {
			return true;
		} else {
			slower = slower.next;
			runner = runner.next.next;
		}
	}
	return false;
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */