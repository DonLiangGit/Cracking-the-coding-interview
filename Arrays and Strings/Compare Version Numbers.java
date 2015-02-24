/* Cracking the coding interview
 * Pre-work 
 * Compare Version Numbers
 *
 * Method: 
 */

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int longerLength = ver1.length > ver2.length ? ver1.length : ver2.length;
        
        int[] ver1Array = new int[longerLength];
        int[] ver2Array = new int[longerLength];
        for(int i = 0; i < ver1.length; i++) {
            ver1Array[i] = Integer.valueOf(ver1[i]);
        }
        for(int i = 0; i < ver2.length; i++) {
            ver2Array[i] = Integer.valueOf(ver2[i]);
        }
        for(int i = 0; i < longerLength; i++) {
            if(ver1Array[i] > ver2Array[i]) {
                return 1;
            } else if(ver1Array[i] < ver2Array[i]) {
                return -1;
            }
        }
        return 0;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */