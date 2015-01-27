/* Cracking the coding interview
 * 1-5
 * String Compression
 */

public String stringCompression(String str) {
	/* Return if the compressed string length is not smaller than original one */
	int strSize = countCompression(str);
	if(str.length() <= strSize) {
		return str;
	}

	StringBuffer strBuffer = new StringBuffer();
	int count = 1;
	char letter = str.charAt(0);
	for(int i = 1; i < str.length(); i++) {
		if(str.chatAt(i) == letter) {
			count ++;
		} else {
			strBuffer.append(letter);
			strBuffer.append(count);
			letter = str.charAt(i);
			count = 1;
		}
	}

	strBuffer.append(letter);
	strBuffer.append(count);
	return strBuffer.toString();
}

public int countCompression(String str) {

	if(str == null) return 0;

	int size = 0;
	int count = 1;
	char letter = str.charAt(0);
	for(int i = 1; i < str.length(); i++) {
		if(str.charAt(i) == letter) {
			count ++;
		} else {
			letter = str.charAt(i);
			size = size + String.valueOf(count).length() + 1;
			count = 1;
		}
	}
	size = size + String.valueOf(count).length() + 1;
	
	return size;
}

/*
 * Extension:
 * APIs: string.isEmpty(), string.valueOf(),
 */
