package movezeroes;
public class MoveZeroes {
	private static int nums[] = {0,1,3,0,12};
	public static void main(String[] args) {
		moveZeroes(nums);
		for (int i : nums)
			System.out.println(i);
	}
	private static void moveZeroes(int[] nums2) {
		int counter = 0;
        for (int i : nums) {
            if (i != 0)
                nums[counter++] = i;
        }
        while (counter < nums.length)
            nums[counter++] = 0;		
	}
}
