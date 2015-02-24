/* Cracking the coding interview
 * Pre-work 
 * Add Binary
 *
 * Method: 
 */

public class Solution {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i >= 0 && j >= 0) {
            int digit = (int)(a.charAt(i) - '0' + b.charAt(j) - '0') + carry;
            carry = digit / 2;
            digit = digit % 2;
            result.append(digit);
            i--;
            j--;
        }

        while(i >= 0) {
            int digit = (int)(a.charAt(i)  - '0') + carry;
            carry = digit / 2;
            digit = digit % 2;
            result.append(digit);
            i--;
        }
        while(j >= 0) {
            int digit = (int)(b.charAt(j)  - '0') + carry;
            carry = digit / 2;
            digit = digit % 2;
            result.append(digit);
            j--;
        }
        if(carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */