package arrays;

public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};
		System.out.println(search(nums, 0));
	}
	
	public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        if (target == nums[pivot]) {
            return pivot;
        }
        if (target <= nums[nums.length - 1]) {
            return binarySearch(nums, pivot, nums.length, target);
        }
        return binarySearch(nums, 0, pivot - 1, target);
    }
    
    private static int findPivot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low)/2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    private static int binarySearch(int[] nums, int low, int high, int target) {
        while (low < high) {
            int mid = low + (high - low)/2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
