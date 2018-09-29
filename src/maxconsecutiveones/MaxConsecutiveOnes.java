/*
 * https://leetcode.com/problems/max-consecutive-ones/description/
 */
package maxconsecutiveones;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                counter ++;
            } else {
                if (counter > max) {
                    max = counter;
                }
                counter = 0;
            }
        }
        return (counter > max)? counter : max;
    }
}
