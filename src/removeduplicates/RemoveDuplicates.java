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
		int len = 0;
    	for (int i = 1; i < nums.length; i ++) {
        	if (nums[len] != nums[i]) {
            	len ++;
            	nums[len] = nums[i];
        	}
    	}
    	return len + 1;
    }
}
