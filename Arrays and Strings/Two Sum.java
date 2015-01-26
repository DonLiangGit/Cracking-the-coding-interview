/* Cracking the coding interview
 * Pre-work 
 * Two Sum
 *
 * Method: Using HashMap to do it.
 */

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for(int i = 0; i < numbers.length; i++) {
            if(hashMap.containsKey(target - numbers[i])) {
                int index = hashMap.get(numbers[i]);
                result[0] = index + 1;
                result[1] = i + 1;
            } else {
                hashMap.put(target - numbers[i], i);
            }
        }

        return result;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */