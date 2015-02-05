/* Cracking the coding interview
 * Pre-work 
 * Symmetric Tree
 *
 * Method: 
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(TreeNode leftNode, TreeNode rightNode) {
        if(leftNode == null) {
            return rightNode == null;
        } else if(rightNode == null) {
            return false;
        }

        if(leftNode.val != rightNode.val) {
            return false;
        }

        if (!isSymmetricHelper(leftNode.left, rightNode.right)) { 
            return false; 
        }
        if (!isSymmetricHelper(leftNode.right, rightNode.left)) {
            return false;
        }

        return true;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */
