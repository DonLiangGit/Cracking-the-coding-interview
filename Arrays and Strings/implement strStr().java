/* Cracking the coding interview
 * Pre-work 
 * Implement strStr()
 *
 * Method: 
 */

public class Solution {
    public String strStr(String haystack, String needle) {
        int stackLen = haystack.length();
        int needleLen = needle.length();

        if(needleLen == 0 && needleLen == stackLen) {
            return "";
        }

        if(needleLen == 0) { return haystack; }
        for(int i = 0; i < stackLen; i++) {
            if(stackLen - i + 1 < needleLen) {
                return null;
            }

            int k = 0;
            int j = i;
            while(needle.charAt(k) == haystack.charAt(j) && k < needleLen && j < stackLen) {
                k++;
                j++;
                if(k == needleLen) {
                    return haystack.substring(i);
                }
            }
        }

        return null;
    }
}

/*
 * Extension:
 * APIs: subString()
 * Note: 
 */