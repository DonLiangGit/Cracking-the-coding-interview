/* Cracking the coding interview
 * Pre-work 
 * Remove Duplicates from a sorted array
 *
 * Method: 
 */

public class Solution {
    public int removeDuplicates(int[] A) {
        // Check Length
        if(A.length == 0) {return 0;}
        if(A.length == 1) {return 1;}

        int slowP = 0;
        int fastP = 1;
        while(fastP < A.length) {
            if(A[slowP] == A[fastP]) {
                fastP++;
            } else {
                slowP++;
                A[slowP] = A[fastP];
                fastP++;
            }      
        }
        return slowP + 1;
    }
}

/*
 * Extension:
 * APIs: toLowerCase() and regex expression
 * Note: 
 */