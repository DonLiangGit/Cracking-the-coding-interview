/* Cracking the coding interview
 * 2-1 
 * Remove duplicates from linked list
 * Use Temporary Buffer(Hash Table)
 * Parameter is head of the linked list.
 */

public static void removeDuplicates(LinkedListNode node) {

	Hashtable hashtable = new Hashtable();
	LinkedListNode pre = null;
	while(node != null) {
		if(hashtable.containsKey(node.data)) {
			pre.next = node.next
		} else {
			hashtable.put(node.data, true);
			pre.next = node;
		}
		node = node.next;
	}

}

/*
 * Extension:
 * APIs: 
 * java.util.Hashtable.containsKey()
 * java.util.Hashtable.put()
 * Note: 
 */