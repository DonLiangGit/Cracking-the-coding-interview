/* Cracking the coding interview
 * Pre-work 
 * Excel Sheet Column Number
 *
 * Method: 
 */

public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        int temp = 0;
        for(int i = 0; i < s.length(); i++) {
            temp = s.charAt(i) - 'A' + 1;
            sum = sum * 26 + temp;
        }
        return sum;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */