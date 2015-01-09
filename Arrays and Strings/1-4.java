/* Cracking the coding interview
 * 1-4
 * Replace Whitespace with %20
 * 
 */

public String wsReplace(String str) {

	char[] strCharArray = str.toCharArray();
	int spaceCount = 0;
	int newLength, i;
	// Space Counting
	for(i = 0; i < strCharArray.length; i++) {
		if(strCharArray[i] == ' ') {
			spaceCount ++;
		}
	}

	// Replace from the backward
	newLength = strCharArray.length + spaceCount * 2;
	str[newLength] = '\0';
	for(i = strCharArray.length - 1; i >=0; i--) {
		if(str[i] == ' ') {
			strCharArray[newLength - 1] = '0';
			strCharArray[newLength - 2] = '2';
			strCharArray[newLength - 3] = '%';
			newLength = newLength - 3;
		} else {
			strCharArray[newLength - 1] = str[i];
			newLength = newLength - 1;
		}
	}
	return new String(strCharArray);
}

/*
 * Extension:
 * APIs: 
 * Note: 
 */