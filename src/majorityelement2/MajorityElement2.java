package majorityelement2;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

	public static void main(String args[]) {
		int[] arr = {1, 2, 2, 3, 2, 1, 1, 3};
		System.out.println(majorityElement(arr));
	}

	private static List<Integer> majorityElement(int[] nums) {
		if (nums.length == 0) {
            return new ArrayList<Integer>();
        }
        List<Integer> result = new ArrayList<Integer>();
        int count1 = 0;
        int count2 = 0;
        int major1 = 0;
        int major2 = 0;
        
        for (int n : nums) {
            if (count1 == 0 && major2 != n) {
                major1 = n;
            } else if (count2 == 0 && major1 != n) {
                major2 = n;
            }
            if (n == major1) {
                count1 ++;
            } else if (n == major2) {
                count2 ++;
            } else {
                count1 --; count2 --;
            }
        }
        count1 = 0; count2 = 0;
        for (int n : nums) {
            if (n == major1) {
                count1 ++;
            }
            if (n == major2) {
                count2 ++;
            }
        }
        if (count1 > nums.length/3) {
            result.add(major1);
        }
        if (major2 != major1 && count2 > nums.length/3) {
            result.add(major2);
        }
        return result;
	}
}
