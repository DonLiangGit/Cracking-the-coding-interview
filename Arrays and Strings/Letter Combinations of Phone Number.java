/* Cracking the coding interview
 * Pre-work 
 * Letter Combinations of a Phone Number
 *
 * Method: Time Complexity is O(K * N)
 */

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0) {
            result.add("");
            return result;
        }
        StringBuilder tempSB = new StringBuilder();
        String[] letters = {"abc", "def", "ghi", 
        "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        letterCombHelper(result, tempSB, 0, digits, letters);     
        return result;
    }

    private void letterCombHelper(List<String> result, StringBuilder tempSB, int step, String digits, String[] letters) {

        if(step == digits.length()) {
            result.add(tempSB.toString());
            return;
        }
        String s = letters[digits.charAt(step)-'2'];
        for(int i = 0; i < s.length(); i++) {           
            tempSB.append(s.charAt(i));
            letterCombHelper(result, tempSB, step+1, digits, letters);
            tempSB.deleteCharAt(tempSB.length()-1);
        }
    }
}
/*
 * Extension:
 * APIs: 
 * Note: 
 */