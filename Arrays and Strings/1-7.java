/* Cracking the coding interview
 * 1-7
 * Matrix M*N 0
 */

public void setZero(int[][] matrix) {
	
	boolean[] row = new boolean[matrix.length];
	boolean[] column = new boolean[matrix[0].length];

	// Find Matrix Element 0, set its row and column TRUE
	for(int i = 0; i < matrix.length; i++) {
		for(int j = 0; j < matrix[0].length; j++) {
			if(matrix[i][j] == 0) {
				row[i] = true;
				column[j] = true;
			}
		}
	}

	// Set the corresponding element ZERO
	for(int i = 0; i < matrix.length; i++) {
		for(int j = 0; j < matrix[0].length; j++) {
			if(row[i] || column[j]) {
				matrix[i][j] = 0;
			}
		}
	}


}

/*
 * Extension:
 * APIs: Matrix row and column representation, 二維陣列Length
 * Note: If set constantly set the row and column without flag the whole Matrix is wiped out.
 */