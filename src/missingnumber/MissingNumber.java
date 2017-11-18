package missingnumber;
public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {0, 1, 3};
		System.out.println(missingNumber(nums));

	}

	private static int missingNumber(int[] nums) {
		int[] bucket = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++)
            bucket[nums[i]] += 1;
        for (int i = 0; i < bucket.length; i++)
            if (bucket[i] == 0)
                return i;
        return 0;
	}
}
