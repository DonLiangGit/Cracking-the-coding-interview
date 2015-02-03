/* Cracking the coding interview
 * Pre-work 
 * Majority Element
 *
 * Method: 
 */

public class Solution {
    public int majorityElement(int[] num) {
        
        int length = num.length / 2;
        HashMap<int, int> hashMap = new HashMap<int, int>();

        for(int i = 0; i < num.length; i++) {
            if(hashMap.containsKey(num[i])) {
                hashMap.put(num[i], hashMap.get(num[i]));
                if(hashMap.get(num[i]) == length) {
                    return num[i];
                }
            } else {
                hashMap.put(num[i], 1);
            }
        }
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */