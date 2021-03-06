package arrays;

public class UniquePaths2 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m == 0) {
            return 0;
        }
        
        int[][] path = new int[m][n];
        if (obstacleGrid[0][0] == 1) {
            return 0;
        } else {
            path[0][0] = 1;
        }
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (obstacleGrid[i][j] == 1) {
                    path[i][j] = 0;
                } else if (i == 0) {
                    if (j > 0) {
                        path[i][j] = path[i][j - 1];
                    }
                } else if (j == 0) {
                    if (i > 0) {
                        path[i][j] = path[i - 1][j];
                    }
                } else {
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
                }
            }
        }
        return path[m - 1][n - 1];
    }
}
