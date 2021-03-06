package arrays;

public class MaximumSubArray {
	public int maxSubArray(int[] nums) {
        int maxSum = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
