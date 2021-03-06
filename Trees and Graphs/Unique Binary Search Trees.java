/* Cracking the coding interview
 * Pre-work 
 * Unique Binary Search Trees
 *
 * Method: 
 */

public class Solution {
    public int numTrees(int n) {
        if(n == 1 || n == 0) {
            return 1;
        } else {
            int num = 0;
            for(int i = 1; i <= n; i++) {
                num += (numTrees(i - 1) * numTrees(n - i));
            }
            return num;
        }
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */
