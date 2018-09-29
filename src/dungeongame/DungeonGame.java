package dungeongame;
/*
 * https://leetcode.com/problems/dungeon-game/description/
 */
public class DungeonGame {
	public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon.length == 0) {
            return 0;
        }
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] minHealth = new int[m][n];
        for (int i = m - 1; i >= 0; i --) {
            for (int j = n - 1; j >= 0; j --) {
                if (i == m - 1 && j == n - 1) {
                    minHealth[i][j] = Math.max(1, 1 - dungeon[i][j]);
                } else if (i == m - 1) {
                    minHealth[i][j] = Math.max(1, minHealth[i][j + 1] - dungeon[i][j]);
                } else if (j == n - 1) {
                    minHealth[i][j] = Math.max(1, minHealth[i + 1][j] - dungeon[i][j]);
                } else {
                    minHealth[i][j] = Math.max(1, Math.min(minHealth[i + 1][j], minHealth[i][j + 1]) - dungeon[i][j]);
                }
            }
        }
        return minHealth[0][0];
    }
}
