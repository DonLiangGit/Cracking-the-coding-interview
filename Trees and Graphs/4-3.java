/* Cracking the coding interview
 * 4-3
 * Convert Sorted Array to Binary Search Tree 
 *
 * Method: 
 * 1. Get the middle element in the array
 * 2. New TreeNode for the Middle Element Value
 * 3. Recursively doing this until exceed the limit
 */

public class Solution {

	public TreeNode sortedArrayToBST(int[] num) {
		if(num.length == 0) {
			return null;
		} else {
			return sortedArrayToBST(num, 0, num.length - 1);
		}
	}

	public TreeNode sortedArrayToBST(int[] num, int start, int end) {
		if(start > end) {return null;}

		int mid = (start + end) / 2;
		TreeNode newNode = new TreeNode(num[mid]);
		newNode.left = sortedArrayToBST(num, start, mid - 1);
		newNode.right = sortedArrayToBST(num, mid + 1, end);
		
		return newNode;
	}
		
}


/*
 * Extension:
 * APIs: 
 * Note: 
 */