package rangesum;
/*
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 */
class RangeSum {
    int[] dp;
    public RangeSum(int[] nums) {
        if (nums.length == 0)
            return;
        dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            dp[i] = dp[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        if (i == 0)
            return dp[j];
        return dp[j] - dp[i - 1];
    }
}
