/* Cracking the coding interview
 * Pre-work 
 * Reverse Words in a String
 *
 * Method: 
 */

public class Solution {
    public String reverseWords(String s) {
        int length = s.length();

        if(length == 0 || s == null) {
            return "";
        }

        StringBuffer sB = new StringBuffer();
        String[] splitS = s.split(" ");
        for (int i = splitS.length - 1; i >= 0; --i) {
            if (!splitS[i].equals("")) {
                sB.append(splitS[i]).append(" ");
            }
        }
        if(sB.length() == 0) {return "";}
        sB.setLength(sB.length() - 1);
        return new String(sB);
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */