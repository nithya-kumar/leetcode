package removeduplicates;
public class RemoveDuplicates {

	private static int nums[] = {1, 1, 2, 3};
	public static void main (String args[]) {
		int len = removeDuplicates(nums);
		System.out.println(len);
		for (int i = 0; i < len; i++)
			System.out.println(nums[i]);
	}
	public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i ++)
        	if (nums[j] != nums[i])
        		nums[++j] = nums[i];
        return ++j;
    }
}
