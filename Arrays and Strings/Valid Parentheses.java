/* Cracking the coding interview
 * Pre-work 
 * Valid Parentheses
 *
 * Method: 
 */

public class Solution {
    public boolean isValid(String s) {

        char[] charArray = s.toCharArray();
        HashMap<Character, Character> hashMap = new HashMap<Character,Character>();
        hashMap.put('(',')');
        hashMap.put('{','}');
        hashMap.put('[',']');

        Stack<Character> stack = new Stack<Character>();
        for(Character c : charArray) {
            if(hashMap.keySet().contains(c)) {
                stack.push(c);
            } else if(hashMap.values().contains(c)) {
                if(!stack.isEmpty() && hashMap.get(stack.peek()) == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */