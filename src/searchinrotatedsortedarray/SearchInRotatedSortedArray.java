package searchinrotatedsortedarray;

public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);
        if (nums[pivot] == target)
            return pivot;
        else if (nums[0] <= target)
            return binarySearch(nums, 0, pivot - 1, target);
        else 
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }
    
    public int findPivot(int[] nums, int low, int high) {  
        if (low > high)
            return -1;
        if (low == high)
            return 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    public int binarySearch(int[] nums, int low, int high, int target) { 
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
