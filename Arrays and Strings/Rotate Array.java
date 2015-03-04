/* Cracking the coding interview
 * Pre-work 
 * Rotate Array
 *
 * Method: 
 */

public class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        if(k == 0) return;

        reverse(nums, 0, length - k - 1);
        reverse(nums, length - k, length - 1);
        reverse(nums, 0, length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        int temp = 0;
        while(start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */