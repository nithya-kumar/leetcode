package intersectionoftwoarrays;
/*
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for (int n : nums1)
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        for (int n : nums2) {
            if (freqMap.containsKey(n) && freqMap.get(n) > 0) {
                res.add(n);
                freqMap.put(n, freqMap.get(n) - 1);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (int n : res)
            result[i ++] = n;
        return result;
    }
}
