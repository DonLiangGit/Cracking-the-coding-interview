/* Cracking the coding interview
 * Pre-work 
 * Binary Tree Level Order Traversal
 *
 * Method: 
 */

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        int queueNum = 1;
        int nextLevel = 0;
        List<Integer> list = new ArrayList<Integer>();
        while(queue.peek() != null) {
            
            TreeNode visitedNode = queue.poll();
            queueNum--;
            list.add(visitedNode.val);

            if(visitedNode.left != null) {
                queue.add(visitedNode.left);
                nextLevel++;
            }
            if(visitedNode.right != null) {
                queue.add(visitedNode.right);
                nextLevel++;
            }

            if (queueNum == 0) {
                queueNum = nextLevel;
                nextLevel = 0;
                result.add(list);
                list = new ArrayList<Integer>();
            }
        }
        return result;
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
