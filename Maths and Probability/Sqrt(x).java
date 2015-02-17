/* Cracking the coding interview
 * Pre-work 
 * Sqrt(x)
 *
 * Method: Division
 */

public class Solution {
    public int sqrt(int x) {
        if(x < 0) return -1;
        if(x == 0) return 0;
        
        long left = 0;
        long right = x/2 + 1;
        while(left <= right) {
            long mid = (left + right) / 2;
            if(mid * mid == x) {
                return (int)mid;
            } else if(mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int)right;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */