package peekindexinamountainarray;
/*
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 */
public class PeekIndexInAMountainArray {
	public int peakIndexInMountainArray(int[] A) {
        int low = 0;
        int high = A.length - 1;
        while (low < high) {
            int mid = (low + high)/2;
            if (A[mid] < A[mid + 1]) {
                low = mid + 1;
            } else if (A[mid - 1] > A[mid]) {
                high = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
