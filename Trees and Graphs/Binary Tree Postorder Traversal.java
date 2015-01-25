/* Cracking the coding interview
 * Pre-work 
 * Binary Tree Preorder Traversal
 *
 * Method: 
 */

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        helper(root, result);
        return result;
    }
  
    private void helper(TreeNode node, ArrayList<Integer> result) {
        if(node == null) { return; }
        else {
          helper(node.left, result);
          helper(node.right, result);
          result.add(node.val);
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