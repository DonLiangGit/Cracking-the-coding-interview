/* Cracking the coding interview
 * Pre-work 
 * Anagrams
 *
 * Method: Using HashMap to do it.
 */

public class Solution {
    public List<String> anagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return null;
        }
        List<String> outputList = new ArrayList<String>();
        HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

        for(String s : strs) {
            String key = null;
            if(s != null && s.length() > 0){
                char[] word = s.toCharArray();
                Arrays.sort(word);
                key = new String(word);
            }
            
            if(hashMap.containsKey(key) == true) {
                ArrayList<String> anagramList = hashMap.get(key);
                anagramList.add(s);
                hashMap.put(key, anagramList);
            } else {
                ArrayList<String> sInList = new ArrayList<String>();
                sInList.add(s);
                hashMap.put(key, sInList);
            }
        }

        // for(String key : hashMap.keySet() ) {
        //     ArrayList<String> val = hashMap.get(key);
        //     if(val.size() > 1){
        //         outputList.addAll(val);
        //     }
        // }
        for(Map.Entry<String, ArrayList<String>> entry : hashMap.entrySet()) {
            ArrayList<String> val = entry.getValue();
            if(val.size() > 1) {
                outputList.addAll(val);
            }           
        }
        return outputList;
    }
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */