package kdiffpairs;
import java.util.*;
public class KDiffPairs {

	public static void main(String[] args) {
		int[] nums = {1, 3, 1, 5, 4};
		int k = 0;
		int result = findKDiffPairs(nums, k);
		System.out.println(result);

	}
	
	public static int findKDiffPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }

}