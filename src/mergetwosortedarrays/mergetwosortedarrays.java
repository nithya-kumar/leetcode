package mergetwosortedarrays;
public class mergetwosortedarrays {

	public static void main(String[] args) {
		int[] nums1 = new int [10];
		nums1[0] = 1;
		nums1[1] = 3;
		nums1[2] = 5;
		nums1[3] = 7;
		int[] nums2 = {2, 4, 6};
		merge(nums1, 4, nums2, 3);
		for (int i = 0; i < 7; i ++) 
			System.out.println(nums1[i]);
		
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0)
            nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        while (j >= 0)
            nums1[k--] = nums2[j--];
    }

}
