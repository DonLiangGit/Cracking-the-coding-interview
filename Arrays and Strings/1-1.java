/* Cracking the coding interview
 * 1-1
 * Step 1: Confirm the charset of the String(e.g. Charset or Unicode)
 * Step 2: Set a boolean array[] for each letter in the string to check duplicate.
 */

public boolean isUniqueString(String str) {
	/* Step 1 */
	int stringLength = str.length();
	if(stringLength > 256) return false;

	/* Step 2 */
	boolean letterSet[] = new boolean[256];
	for(int i = 0; i < str.length(); i++) {
		int letterVal = str.charAt(i);
		if(letterSet[letterVal]) return false;
		letterSet[letterVal] = true;
	}
	return true;
} 

/*
 * Extension:
 * APIs: String.length()
 * Unicode & ASCII
 */