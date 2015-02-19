/* Cracking the coding interview
 * Pre-work 
 * Longest Common Prefix
 *
 * Method: 
 */

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }

        for(int prefixLen = 0; prefixLen < strs[0].length(); prefixLen++) {
            char c = strs[0].charAt(prefixLen);
            for(int i = 1; i < strs.length; i++) {
                if(prefixLen >= strs[i].length() 
                    || c != strs[i].charAt(prefixLen)) {
                    return strs[i].substring(0, prefixLen);
                }
            }
        }
        return strs[0];
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */