/* Cracking the coding interview
 * Pre-work 
 * Binary Tree Inorder Traversal
 *
 * Method: 
 */

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
    	if(root == null) { return; }
    	else {
    		helper(root.left, result);
    		result.add(root.val);
    		helper(root.right, result);
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