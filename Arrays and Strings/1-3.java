/* Cracking the coding interview
 * 1-3
 */

public boolean isPermutation(String str1, String str2) {
	if(str1.length() != str2.length()) {
		return false;
	}
	return stringSort(str1).equals(stringSort(str2));
}

public String stringSort(String str) {
	char[] charArray = str.toCharArray();
	java.util.Arrays.sort(charArray);
	return new String(charArray);
}

/*
 * Extension:
 * APIs: ==/.equals(); toCharArray(); sort()
 */