/* Cracking the coding interview
 * Pre-work 
 * Remove Element
 *
 * Method: 
 */

public class Solution {
    public int removeElement(int[] A, int elem) {

        int lengthPointer = 0;
        int checkPointer = 0;
        while(checkPointer < A.length) {
            if(A[checkPointer] != elem) {
                A[lengthPointer] = A[checkPointer];
                lengthPointer++;
            }
            checkPointer ++;
        }

        return lengthPointer;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */