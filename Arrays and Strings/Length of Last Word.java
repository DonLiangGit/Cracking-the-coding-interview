/* Cracking the coding interview
 * Pre-work 
 * Length of Last Word
 *
 * Method: 
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0 || s == null) {
            return 0;
        }
        String[] strArray = s.toLowerCase().split(" ");
        if(strArray.length == 0) { return 0;}

        String str = strArray[strArray.length - 1];
        int count = 0;
        for(int i = 0; i < str.length(); i ++) {
            count ++;
        }
        return count;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */