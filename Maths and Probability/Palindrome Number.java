/* Cracking the coding interview
 * Pre-work 
 * Palindrome Number
 *
 * Method: 
 */

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        } else if(x == 0) {
            return true;
        }

        int div = 1;
        while(x / div >= 10) {
            div = div * 10;
        }

        while(x != 0) {
            int left = x % 10;
            int right = x / div;
            if(left != right) {
                return false;
            }
            x = (x % div) / 10;
            div = div / 100;
        }
        return true;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */