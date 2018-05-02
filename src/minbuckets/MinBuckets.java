package minbuckets;
import java.util.ArrayList;
import java.util.List;

public class MinBuckets {

	public static void main(String[] args) {
		int a[] = new int[] {7, 3, 5, 4, 1};
		int k = 9;
		List<Integer>[] buckets = minBuckets(a, k);
		for (int i = 0; i < buckets.length; i ++) {
			if (buckets[i] != null)
				System.out.println(buckets[i]);
		}
	}

	private static List<Integer>[] minBuckets(int[] a, int k) {
		List<Integer>[] buckets = new List[a.length];
		int sum = 0, j = 0;
		for (int i : a) {
			if (sum + i <= k) {
				if (buckets[j] == null)
					buckets[j] = new ArrayList<Integer>();
				buckets[j].add(i);
				sum += i;
			} else {
				j ++;
				if (buckets[j] == null)
					buckets[j] = new ArrayList<Integer>();
				buckets[j].add(i);
				sum = i;
			}
		}
		return buckets;
	}

}
