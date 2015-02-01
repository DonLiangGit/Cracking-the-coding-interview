/* Cracking the coding interview
 * Pre-work 
 * Climbing Stairs
 *
 * Method: 
 */

public class Solution {
    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }

        int i = 3;
        int sum = 2;
        int preStep = 1;
        int temp;
        while(i <= n) {
            temp = sum;
            sum = sum + preStep;
            preStep = temp;
            i++;
        }

        return sum;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */