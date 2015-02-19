/* Cracking the coding interview
 * Pre-work 
 * Palindrome Partitioning
 *
 * Method: 
 */

public class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<List<String>> result = new ArrayList<List<String>>();
        ArrayList<String> item = new ArrayList<String>();
        if(s.length() == 0 || s == null) {
            return result;
        }
        partitionHelper(s, item, result);
        return result;
    }
    
    public void partitionHelper(String s, ArrayList<String> item, ArrayList<List<String>> result) {
        if(s.length() == 0) {
            result.add(new ArrayList<String>(item));
        }
        int len = s.length();
        for(int i = 1; i <= s.length(); i++) {
            String buffer = s.substring(0, i);
            if(isPalindrome(buffer)) {
                item.add(buffer);
                String restSub = s.substring(i);
                partitionHelper(restSub, item, result);
                item.remove(item.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */