/* Cracking the coding interview
 * 2-3 
 * Delete a node in the middle of a singly linked list
 * If the node is the last element of the list, it cannot be delete, 
 * becuase we need to set it as a dummy node.
 */

public static boolean deleteMiddleNode(LinkedListNode node) {

	// It means the operation of delete is failed.
	// Including the input is a null node or it is a DUMMY node.
	if(node == null || node.next == null) {
		return false;
	}

	// Simply put node.next data to current, change the current.next
	node.data = node.next.data;
	node.next = node.next.next;
	return true;
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */