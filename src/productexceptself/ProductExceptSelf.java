package productexceptself;
public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] output = productExceptSelf(nums);
		for (int i : output)
			System.out.println(i);
	}

	private static int[] productExceptSelf(int[] nums) {
		int[] output = new int[nums.length];
        for (int i = 0, temp = 1; i < nums.length; i ++) {
            output[i] = temp;
            temp = temp * nums[i];
        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i --) {
            output[i] = output[i] * temp;
            temp = temp * nums[i];
        }
        return output;
	}

}
