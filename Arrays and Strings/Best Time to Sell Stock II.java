/* Cracking the coding interview
 * Pre-work 
 * Best Time to buy and sell stock II
 *
 * Method:
 */

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
        	return 0;
        }

        int max = 0;
        int diff = 0;
        for(int i = 1; i < prices.length; i++) {
        	diff = prices[i] - prices[i-1];
        	if(diff > 0) {
        		max += diff;
        	}
        }
        return max;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */