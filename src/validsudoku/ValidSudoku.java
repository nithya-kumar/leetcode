package validsudoku;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        int r = 9, c = 9;
        for (int i = 0; i < r; i ++) {
            Set<Character> rowSet = new HashSet<Character>();
            Set<Character> colSet = new HashSet<Character>();
            Set<Character> blockSet = new HashSet<Character>();
            int rowIndex = 3 * (i / 3);
            int colIndex = 3 * (i % 3);
            for (int j = 0; j < c; j ++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) 
                    return false;
                if (board[j][i] != '.' && !colSet.add(board[j][i]))
                    return false;
                if (board[rowIndex + j/3][colIndex + j % 3] != '.' && !blockSet.add(board[rowIndex + j/3][colIndex + j % 3]))
                    return false;
            }
        }
        return true;        
    }
}
