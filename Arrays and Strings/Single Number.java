/* Cracking the coding interview
 * Pre-work 
 * Single Number
 *
 * Method: 
 */

public class Solution {
    public int singleNumber(int[] A) {
        
        int num = 0;
        for(Integer a : A) {
            num = num ^ a;
        }
        return num;
    }
}
// public class Solution {
//     public int singleNumber(int[] A) {
//         HashSet<Integer> hashSet = new HashSet<Integer>();
//         for(int i = 0; i < A.length; i++) {
//             if(hashSet.contains(A[i])) {
//                 hashSet.remove(A[i]);
//             } else {
//                 hashSet.add(A[i]);
//             }
//         }

//         for(Iterator i : hashSet) {
//             return i;
//         }
//     }
// }

/*
 * Extension:
 * APIs: 
 * Note: 
 */