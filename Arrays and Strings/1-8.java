/* Cracking the coding interview
 * 1-8
 * String Rotation
 * Supposed that we got a isSubstring() and call it once
 */


public boolean isRotation(String s1, String s2) {

	int stringLength = s1.length();

	if(stringLength == s2.length()) {
		String stringConcat = s1 + s1;
		// Return Boolean result
		isSubstring(stringConcat, s2);
	}
	return false;
}

/*
 * Extension:
 * APIs: re-write isSubString()
 * Note: 
 */