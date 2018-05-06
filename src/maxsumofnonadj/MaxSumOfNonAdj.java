package maxsumofnonadj;

public class MaxSumOfNonAdj {

	public static void main(String[] args) {
		int[] arr = {5, 5, 10, 100, 10, 5};
		System.out.println("SUM" + findMaxSum(arr));
	}

	private static int findMaxSum(int[] nums) {
		if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i ++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
	}
}
