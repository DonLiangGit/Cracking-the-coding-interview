/* Cracking the coding interview
 * 1-6
 * Rotate Matrix(N*N) 90 degrees
 * 
 */

public void rotateMatrix(int[][] matrix) {

	for(int layer = 0; layer < n/2; ++layer) {
		int first = layer;
		int last = n - 1 - layer;
		for(int i = first; i < last; ++i) {
			int offset = i - first;
			// Top tmp
			int top = matrix[first][i];

			// Left -> Top
			matrix[first][i] = matrix[last-offset][first];
			// Bottom -> Left
			matrix[last-offset][first] = matrix[last][last-offset];
			// Right -> Bottom
			matrix[last][last-offset] = matrix[i][last];
			// Top -> Right
			matrix[i][last] = top;
		}
	}
}

/*
 * Extension:
 * APIs: 
 * Note: From outer to inner.
 */