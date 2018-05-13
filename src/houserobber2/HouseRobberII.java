package houserobber2;
public class HouseRobberII {

	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 1};
		System.out.println(rob(nums));

	}
	
	public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }
    
    public static int rob (int[] nums, int start, int end) {
        int dp[] = new int[nums.length - 1];
        if (nums.length - 1 == 2) return Math.max(nums[start], nums[end]);
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2, j = 2; i <= end; i ++, j ++) {
            dp[j] = Math.max(nums[i] + dp[j - 2], dp[j - 1]);
        }
        return dp[nums.length - 2];
    }
}
