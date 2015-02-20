/* Cracking the coding interview
 * Pre-work 
 * Combinations
 *
 * Method: 
 */

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> oneCombine = new ArrayList<Integer>();

        if(n == 0 || k ==0) return result;
        if(n < k) return result;

        combineHelper(n, k, oneCombine, result, 1);
        return result;
    }

    public void combineHelper(int n, int k, 
        List<Integer> comb, List<List<Integer>> result, int start) {
        if(comb.size() == k) {
           result.add(new ArrayList<Integer>(comb));
           return; 
        }
        for(int i = start; i <= n; i++) {
            comb.add(i);
            combineHelper(n, k, comb, result, i+1);
            comb.remove(comb.size()-1);
        }
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */