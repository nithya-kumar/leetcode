package noofislands;

public class NoOfIslands {
	public int numIslands(char[][] grid) {
        if (grid.length == 0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (grid[i][j] == '1') {
                    count ++;
                    DFSMakeZero(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public void DFSMakeZero(char[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = '0';
            DFSMakeZero(grid, i - 1, j);
            DFSMakeZero(grid, i + 1, j);
            DFSMakeZero(grid, i, j - 1);
            DFSMakeZero(grid, i, j + 1);
        }
    }
}
