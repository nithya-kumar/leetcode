package maxproductofthreenumbers;

public class MaxProductOfThreeNumbers {
	public static void main(String[] args) {
		int[] nums = {1, -4, 3, -6, 7, 0};
		System.out.println(maxProduct(nums));

	}

	private static int maxProduct(int[] nums) {
		if (nums.length < 3)
			return -1;
		int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
		int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i ++) {
			if (nums[i] > maxA) {
				maxC = maxB;
				maxB = maxA;
				maxA = nums[i];
			} else if (nums[i] > maxB) {
				maxC = maxB;
				maxB = nums[i];
			} else if (nums[i] > maxC) {
				maxC = nums[i];
			}
			
			if (nums[i] < minA) {
				minB = minA;
				minA = nums[i];
			} else if (nums[i] < minB) {
				minB = nums[i];
			}
		}
		return Math.max (maxA * maxB * maxC, maxA * minA * minB);
	}
}
