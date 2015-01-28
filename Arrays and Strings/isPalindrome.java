/* Cracking the coding interview
 * Pre-work 
 * Valid Palindrome
 *
 * Method: two pointers
 */

public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        if(s.length() == 1) {return true;}
        
        String newStr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(newStr.length() <= 1) {return true;}
        
        for(int i = 0; i < newStr.length(); i++) {
            if(newStr.charAt(i) != newStr.charAt(newStr.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

/*
 * Extension:
 * APIs: toLowerCase() and regex expression
 * Note: 
 */