/* Cracking the coding interview
 * Pre-work 
 * Minimum Depth of Binary Tree
 *
 * Method: 
 */

public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) {return 0;}

        if(root.left == null) { 
        	return minDepth(root.right) + 1;
        }
        if(root.right == null) { 
        	return minDepth(root.left) + 1;
        }

        return Max.min(minDepth(root.left), minDepth(root.right)) + 1;
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