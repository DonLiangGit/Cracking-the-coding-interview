/* Cracking the coding interview
 * Pre-work 
 * Count and Say
 *
 * Method: 
 */

public class Solution {
    public String countAndSay(int n) {
        if(n <= 0) return "";

        String str = "1";
        int num = 1;
        for(int i = 0; i < n - 1; i++) {
            StringBuilder sB = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if(j < str.length() - 1 && str.charAt(j) == str.charAt(j+1)) {
                    num++;
                } else {
                    sB.append(num + "" + str.charAt(j));
                    num = 1;
                }
            }
            str = sB.toString();
        }
        return str;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */