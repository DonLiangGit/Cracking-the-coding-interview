/* Cracking the coding interview
 * Pre-work 
 * Flatten Binary Tree to Linked List
 *
 * Method: Using Stack to Store the Right Branch then merge
 */

public class Solution {
    public void flatten(TreeNode root) {
        Stack<TreeNode> rightBranchStack = new Stack<TreeNode>();
        TreeNode pointNode = root;

        while(pointNode != null || !rightBranchStack.empty()) {
        	
        	if(pointNode.right != null) {
        		rightBranchStack.push(pointNode.right);
        	}

        	if(pointNode.left != null) {
        		pointNode.right = pointNode.left;
        		pointNode.left = null;
        	} else if(!rightBranchStack.empty()) {
        		TreeNode temp = rightBranchStack.pop();
        		pointNode.right = temp;
        	}

        	pointNode = pointNode.right;
        }
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