/* Cracking the coding interview
 * 1-2
 * Reverse a String
 * 
 */

public String stringReverse(String str) {

	if(str == null) return null;

	char[] stringArray = str.toCharArray();
	char tmp;
	for(int i = stringArray.length - 1, j = 0;
		i >= 0; i--, j++) {
		stringArray[i] = str.charAt(j);
	}

	return new String(stringArray);
}

/*
 * Extension:
 * APIs: 
 * Note: Surrogate Pair is ?
 */