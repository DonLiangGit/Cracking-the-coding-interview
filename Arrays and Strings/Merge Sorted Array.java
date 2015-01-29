/* Cracking the coding interview
 * Pre-work 
 * Merge sorted array
 *
 * Method: 
 */

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int aTail = m - 1;
        int bTail = n - 1;
        int combineTail = m + n - 1;

        for(int i = combineTail; i >= 0; i--) {
            if((A[aTail] > B[bTail]&&aTail >=0) || bTail < 0) {
                A[i] = A[aTail];
                aTail--;
            } else {
                A[i] = A[bTail];
                bTail--;
            }
        }
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */