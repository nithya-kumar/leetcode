package search2dmatrix;
/*
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 */
public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (target == matrix[i][j])
                return true;
            else if (target < matrix[i][j])
                j --;
            else
                i ++;
        }
        return false;
    }
}
