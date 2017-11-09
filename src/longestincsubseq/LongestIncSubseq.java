package longestincsubseq;

import java.util.Arrays;

public class LongestIncSubseq {

	public static void main(String[] args) {
		int[] nums = {10,9,2,5,3,7,101};
		System.out.println(Arrays.binarySearch(nums,0, 2, 101));
		System.out.println(lengthOfLIS(nums));
	}
	
	public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) 
            return 0;
        int maxLen = 1;
        int[] dp_table = new int[nums.length];
        dp_table[0] = 1;
        for (int i = 1; i < nums.length; i ++) {
            int count = 0;
            for (int j = 0; j < i; j ++) {
                if (nums[i] > nums[j]) {
                    count = Math.max(count, dp_table[j]);
                }
            }
            dp_table[i] = count + 1;
            maxLen = Math.max(maxLen, dp_table[i]);                
        }
        return maxLen;
    }

}
