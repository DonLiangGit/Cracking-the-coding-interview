/* Cracking the coding interview
 * Pre-work 
 * Reverse Integer
 *
 * Method: 
 */

public class Solution {
    public int reverse(int x) {
        if(x == 0) {return 0;}

        boolean flag = false;
        if(x < 0) {
            x = -x;
            flag = true;
        }
            
        int pre;
        int sum = 0;
        while(x > 0) {
            /* Important */
            if(sum > Integer.MAX_VALUE / 10) {return 0;}
            pre = x % 10;
            x = x / 10;
            sum = sum * 10 + pre;           
        }
        
        if(flag == true) {
            return -sum;
        } else {
            return sum;
        }
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */