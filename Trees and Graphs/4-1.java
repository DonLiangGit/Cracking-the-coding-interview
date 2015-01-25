/* Cracking the coding interview
 * 4-1 
 * Balanced Binary Tree
 *
 * Method: I use recursion method to get the height from each sub branch.
 * if to the bottom it return subtreeheight + 1(current node height)
 */

public class Solution {

	// -1 means the height is more than 1, not a balanced tree
	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		} else if(getHeight(root) == -1) {
			return false;
		}

		return true;
	}

	public int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}

		int leftHeight = getHeight(root.leftNode);
		int rightHeight = getHeight(root.rightNode);

		if(leftHeight == -1 || rightHeight == -1) {
			return -1;
		} else if(Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}

		return Math.max(leftHeight, rightHeight) + 1;
	}
}

class TreeNode {
	int val;
	TreeNode leftNode;
	TreeNode rightNode;

	TreeNode(int x) {
		val = x;
	}
}


/*
 * Extension:
 * APIs: 
 * Note: 
 */