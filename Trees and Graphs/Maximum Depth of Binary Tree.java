/* Cracking the coding interview
 * Pre-work 
 * Maximum Depth of Binary Tree
 *
 * Method: 
 */

public class Solution {
    public int maxDepth(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        
    }
}

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
 * Extension:
 * APIs: 
 * Note: 
 */