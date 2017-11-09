package spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		List <Integer> res = new ArrayList<Integer>();
		res = spiralOrder(matrix);
		for (int num: res)
			System.out.println(num);
	}

	private static List<Integer> spiralOrder(int[][] matrix) {
		List <Integer> res = new ArrayList<Integer>();
		int rStart = 0, cStart = 0;
		int rEnd = matrix.length - 1;
		int cEnd = matrix[0].length - 1;
		while (rStart <= rEnd && cStart <= cEnd) {
			for (int j = cStart; j <= cEnd; j ++)
				res.add(matrix[rStart][j]);
			rStart ++;
			for (int i = rStart; i <= rEnd; i ++)
				res.add(matrix[i][cEnd]);
			cEnd --;
            if (rStart <= rEnd) {
                for (int j = cEnd; j >= cStart; j --)
                    res.add(matrix[rEnd][j]);
            }
            rEnd --;
            if (cStart <= cEnd) {
                for (int i = rEnd; i >= rStart; i --)
                    res.add(matrix[i][cStart]);
            }
			cStart ++;				
		}
		return res;
	}

}
