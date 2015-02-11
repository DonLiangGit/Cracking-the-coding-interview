/* Cracking the coding interview
 * Pre-work 
 * 3Sum Closet
 *
 * Method: 
 */

public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(num);

        for(int i = 0; i < num.length - 2; i++) {
        	int head = i + 1;
        	int tail = num.length - 1;
        	while(head < tail) {
        		int sum = num[i] + num[head] + num[tail];
        		int diff = Math.abs(sum - target);
        		if(sum == target) {
        			return sum;
        		}
        		if(diff < min) {
        			min = diff;
        			result = sum;
        		}
        		if(sum <= target) {
        			head++;
        		} else {
        			tail--;
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