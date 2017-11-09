package maxsumcontarray;
public class MaxSumContArray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

	private static int maxSubArray(int[] nums) {
		int max = nums[0];
		int maxEnd = nums[0];
		for (int i = 1; i < nums.length; i ++) {
			maxEnd = Math.max(nums[i] + maxEnd, nums[i]);
			max = Math.max(maxEnd, max);
		}
		return max;
	}

}
