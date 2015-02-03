/* Cracking the coding interview
 * Pre-work 
 * String to Integer
 *
 * Method: 
 */

public class Solution {
    public int atoi(String str) {
        
        if(str.length() == 0 || str == null) { return 0; }

        str = str.trim();
        int i = 0;
        char flag = '+';
        if(str.charAt(i) == '-') {
            flag = '-';
            i++;
        } else if(str.charAt(i) == '+'){ i++; }

        double result = 0;
        while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if(flag == '-')
            result = -result;

        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(result < Integer.MIN_VALUE) { return Integer.MIN_VALUE; }

        return (int)result;
    }
}
/*
 * Extension:
 * APIs: 
 * Note: 
 */