package nextgreatest;
public class NextGreatest {

	private static int[] nums = {7, 5, 6, 3, 4, 1, 2, 0};
	public static void main(String[] args) {
		nextGreatest();
		for (int i = 0; i < nums.length; i ++) 
			System.out.println(nums[i] + " ");
		
	}

	static void nextGreatest() {
        int size = nums.length;
 
        // Initialize the next greatest element
        int max_from_right =  nums[size-1];
 
        // The next greatest element for the rightmost
        // element is always -1
        nums[size-1] = -1;
 
        // Replace all other elements with the next greatest
        for (int i = size-2; i >= 0; i--)
        {
            // Store the current element (needed later for
            // updating the next greatest element)
            int temp = nums[i];
 
            // Replace current element with the next greatest
            nums[i] = max_from_right;
 
            // Update the greatest element, if needed
            if(max_from_right < temp)
            max_from_right = temp;
        }
    }
}
