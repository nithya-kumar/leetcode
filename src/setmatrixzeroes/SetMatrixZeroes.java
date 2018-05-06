package setmatrixzeroes;

public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
        boolean isFirstRowZero = false, isFirstColZero = false;
        int m = matrix.length;
        int n= matrix[0].length;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        isFirstRowZero = true;
                    }
                    matrix[i][0] = 0;
                    if (j == 0) {
                        isFirstColZero= true;
                    }
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i ++) {
            for (int j = 1; j < n; j ++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        if (isFirstRowZero)
            for (int j = 0; j < n; j ++)
                matrix[0][j] = 0;
        if (isFirstColZero)
            for (int i = 0; i < m; i ++)
                matrix[i][0] = 0;
    }
}
