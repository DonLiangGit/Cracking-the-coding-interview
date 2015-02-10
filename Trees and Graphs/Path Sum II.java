/* Cracking the coding interview
 * Pre-work 
 * Path Sum II
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) {
        	return result;
        }
        List<Integer> route = new ArrayList<Integer>();
        int sumVal = sum;
        route.add(root.val);

        pathSumHelper(root, sumVal - root.val, route, result);
        return result;
    }

    public void pathSumHelper(TreeNode node, int sum, List<Integer> route, List<List<Integer>> res) {
    	if(node == null) { return; }
    	if(node.left == null && node.right == null && sum == 0) {
    		res.add(new ArrayList(route));
    	}

    	if(node.left != null) {
    		route.add(node.left.val);
    		pathSumHelper(node.left, sum-node.left.val, route, res);
    		route.remove(route.size() - 1); 
    		// remove the index element to restore the state from recursion
    	}
    	if(node.right != null) {
    		route.add(node.right.val);
    		pathSumHelper(node.right, sum-node.right.val, route, res);
    		route.remove(route.size() - 1); 
    		// remove the index element to restore the state from recursion
    	}

    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */
