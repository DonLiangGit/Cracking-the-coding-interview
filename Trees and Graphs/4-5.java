/* Cracking the coding interview
 * 4-5
 * Validate Binary Search Tree
 *
 * Method: Alpha Beta Pruning
 * Error: {2147483647} exceed the boundary
 */

public class Solution {

	// -1 means the height is more than 1, not a balanced tree
	public boolean isValidBST(TreeNode root) {
		return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean validate(TreeNode node, int min, int max) {

		if(node == null) {
			return true;
		} else if(node.val > min && node.val < max) {
			return validate(node.left, min, node.val) && validate(node.right, node.val, max);
		} else {
		    return false;   
		}
	}
		
}


/*
 * Extension:
 * APIs: 
 * Note: 
 */