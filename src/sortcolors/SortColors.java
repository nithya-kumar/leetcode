package sortcolors;

public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, med = 0, high = nums.length - 1;
        while (med <= high) {
            if (nums[med] == 0) {
                swap (low, med, nums);
                low ++; med ++;
            } else if (nums[med] == 1) {
                med ++;
            } else if (nums[med] == 2) {
                swap (med, high, nums);
                high --;
            }
        }
    }
    
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
