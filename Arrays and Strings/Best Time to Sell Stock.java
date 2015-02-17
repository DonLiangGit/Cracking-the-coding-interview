/* Cracking the coding interview
 * Pre-work 
 * Best Time to buy and sell stock
 *
 * Method:
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i : prices) {
            max = Math.max(max, i - min);
            min = Math.min(min, i);
        }
        return max;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */