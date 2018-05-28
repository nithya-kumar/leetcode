package findradius;
/*
 * https://leetcode.com/problems/heaters/description/
 */
import java.util.Arrays;

public class FindRadius {
	public int findRadius(int[] houses, int[] heaters) {
        int max = 0;
        int j = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        for (int i = 0; i < houses.length; i ++) {
            int diff1 = 0;
            int diff2 = 0;
            while (j < heaters.length - 1) {
                diff1 = Math.abs(houses[i] - heaters[j]);
                diff2 = Math.abs(houses[i] - heaters[j + 1]);
                if (diff2 <= diff1) {
                    j ++;
                    continue;
                }
                break;
            }
            max = Math.max(max, Math.abs(houses[i] - heaters[j]));
        }
        return max;
    }
}
