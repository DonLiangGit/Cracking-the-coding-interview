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

        while(combineTail >= 0){
            if(bTail < 0 || (aTail >= 0 && A[aTail] > B[bTail])) {
                A[combineTail] = A[aTail];
                aTail--;
                combineTail--;
            } else {
                A[combineTail] = B[bTail];
                bTail--;
                combineTail--;
            }
        }
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */