/* Cracking the coding interview
 * Pre-work 
 * Unique Path
 *
 * Method: 
 */

public class Solution {
    public int uniquePaths(int m, int n) {
        if(m <= 0 || n <= 0) {
            return 0;
        }
        int[] res = new int[n];
        res[0] = 1;

        for(int i = 0; i < m; i++) {
            for(int j = 1; j < n; j++) {
                res[j] = res[j] + res[j-1];
            }
        }
        return res[n-1];
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */