package medianoftwosortedarrays;
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m1, m2;
		if ((nums1.length + nums2.length) % 2 == 0) {
			m1 = (nums1.length + nums2.length)/2;
			m2 = (nums1.length + nums2.length)/2 + 1;
			double med1 = findElement(nums1, nums2, m1);
			double med2 = findElement(nums1, nums2, m2);
			return ((med1 + med2)/2);
		}
		m1 = (nums1.length + nums2.length + 1)/2;
		return findElement(nums1, nums2, m1);
	}

	private static double findElement(int[] a1, int[] a2, int m) {
		int merge[] = new int[a1.length + a2.length];
		int i = 0, j = 0, k = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				merge[k++] = a1[i++];
			} else {
				merge[k++] = a2[j++];
			}
		}
		while (i < a1.length) {
			merge[k++] = a1[i++];
		}
		while (j < a2.length) {
			merge[k++] = a2[j++];
		}
		return merge[m - 1];
	}

}
