/* Cracking the coding interview
 * Pre-work 
 * Maximum Product Subarray
 *
 * Method: 
 */

public class Solution {
    public int maxProduct(int[] A) {
        if(A == null || A.length == 0) {
        	return 0;
        }

        int maxProduct = A[0];
        int maxTempProduct = A[0];
        int minTempProduct = A[0];
        for(int i = 1; i < A.length; i++) {
        	int curProductA = A[i] * minTempProduct;
        	int curProductB = A[i] * maxTempProduct;
        	minTempProduct = Math.min(Math.min(curProductA, curProductB), A[i]);
        	maxTempProduct = Math.max(Math.max(curProductA, curProductB), A[i]);
        	maxProduct = Math.max(maxProduct, maxTempProduct); 
        }
        return maxProduct;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */