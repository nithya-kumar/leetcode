package arrays;

public class UniquePath {
	public int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (i == 0 || j == 0) {
                    path[i][j] = 1;
                } else {
                    path[i][j] = path[i][j - 1] + path[i - 1][j];
                }
            }
        }
        return path[m - 1][n - 1];
    }
}
