/*
 * https://leetcode.com/problems/two-sum
 */
package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 10, 12};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + "," + result[1]);
		//System.out.println(result);
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		if (nums.length < 1) {
            return null;
        }
		for (int i = 0; i < nums.length; i ++) {
			if (numMap.containsKey(target - nums[i])) {
				ans[1] = i;
				ans[0] = numMap.get(target - nums[i]);
			}
			numMap.put(nums[i], i);
		}
		if (ans[0] == 0 && ans[1] == 0) {
			return null;
		}
		return ans;
	}

}
