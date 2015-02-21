/* Cracking the coding interview
 * Pre-work 
 * Factorial Trailing Zeros
 *
 * Method:
 */

public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0) {
            count += n/5;
            n = n/5;
        }
        return count;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */