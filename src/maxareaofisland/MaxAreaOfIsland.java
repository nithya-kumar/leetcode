package maxareaofisland;

public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n= grid[0].length;
        int val = 0;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                val = DFSCompute(i, j, m, n, grid);
                if (val > max)
                    max = val;
            }
        }
        return max;
    }
    
    public int DFSCompute(int i, int j, int m, int n, int[][] grid) {
        if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + DFSCompute(i + 1, j, m, n, grid) + DFSCompute(i - 1, j, m, n, grid) + DFSCompute(i, j + 1, m, n, grid) + DFSCompute(i, j - 1, m, n, grid);
        }
        return 0;
    }
}
