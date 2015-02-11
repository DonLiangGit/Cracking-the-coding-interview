/* Cracking the coding interview
 * Pre-work 
 * 4Sum
 *
 * Method: 
 */

public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        
        // Sort Array
        Arrays.sort(num);

        HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < num.length; i++) {
        	for(int j = i + 1; j < num.length; j++) {
        		int head = j + 1;
        		int tail = num.length - 1;

        		while(head < tail) {
        			int sum = num[i] + num[j] + num[head] + num[tail];

        			if(sum > target) {
        				tail--;
        			} else if (sum < target) {
        				head++;
        			} else if(sum == target) {
        				ArrayList<Integer> temp = new ArrayList<Integer>();
        				temp.add(num[i]);
        				temp.add(num[j]);
        				temp.add(num[head]);
        				temp.add(num[tail]);

        				if(!hashSet.contains(temp)) {
        					hashSet.add(temp);
        					result.add(temp);
        				}

        				head++;
        				tail--;
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