/* Cracking the coding interview
 * Pre-work 
 * Path Sum
 *
 * Method: DFS
 */

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }

        if(root.left == null && root.right == null && sum == root.val) {
            return true;
        }

<<<<<<< HEAD
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
=======
        return hasPathSum(root.left, sum - root.val) || 
        hasPathSum(root->right,sum - root->val);
>>>>>>> 59a7c079222859cf7f51845dc08aa36bc6b9d51c
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
