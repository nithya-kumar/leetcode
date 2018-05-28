package firstbadversion;
/*
 * https://leetcode.com/problems/first-bad-version/description/
 */
public class FirstBadVersion {
	public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
           int mid = low + (high - low)/2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;        
    }
}
