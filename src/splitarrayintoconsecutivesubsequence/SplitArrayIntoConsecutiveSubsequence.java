package splitarrayintoconsecutivesubsequence;

import java.util.HashMap;
import java.util.Map;

/* 
 * https://leetcode.com/problems/split-array-into-consecutive-subsequences/description/
 */
public class SplitArrayIntoConsecutiveSubsequence {
	 public boolean isPossible(int[] nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        Map<Integer, Integer> tails = new HashMap<Integer, Integer>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (int n : nums) {
            if (count.get(n) == 0)
                continue;
            else if (tails.getOrDefault(n, 0) > 0) {
                tails.put(n, tails.get(n) - 1);
                tails.put(n + 1, tails.getOrDefault(n + 1, 0) + 1);
            } else if (count.getOrDefault(n + 1, 0) > 0 && count.getOrDefault(n + 2, 0) > 0) {
                count.put(n + 1, count.get(n + 1) - 1);
                count.put(n + 2, count.get(n + 2) - 1);
                tails.put(n + 3, tails.getOrDefault(n + 3, 0) + 1);
            } else {
                return false;
            }
            count.put(n, count.get(n) - 1);
        }
        return true;
    }
}
