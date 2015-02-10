/* Cracking the coding interview
 * Pre-work 
 * 3Sum
 *
 * Method: 
 * Naive Solution should be O(n^3)
 */

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // If the num.length is smaller than 3, can not satisfy the requirements.
        if(num.length < 3) {
            return result;
        }

        // Sort Array;
        Arrays.sort(num);

        // num.length - 2 ensure there still valid amount of elements to check.
        for(int i = 0; i < num.length - 2; i++) {
            // Duplicate avoidance for Reference Value
            if(i == 0 || num[i] > num[i - 1]) {

                int negate = -num[i];       // Get the first num and decide the sum of other two.
                int start = i + 1;          // Start Pointer
                int end = num.length - 1;   // Tail Pointer

                while(start < end) {
                    // Case 1: find the result
                    if(num[start] + num[end] == negate) {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[start]);
                        temp.add(num[end]);
                        result.add(temp);

                        start++;
                        end--;
                        // Duplicate avoidance
                        while(start < end && num[end] == num[end+1]) {
                            end--;
                        }
                        while(start < end && num[start] == num[start-1]) {
                            start++;
                        }

                    } else if(num[start] + num[end] < negate){
                    // Case 2: 
                        start++;
                    } else {
                    // Case 3:
                        end--;
                    }
                    

                }
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