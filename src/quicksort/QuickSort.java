package quicksort;

public class QuickSort {

	static int A[] = new int[] {19, 24, 12, 9, 15, 26, 5, 21, 14, 32};
	static int n = A.length;
	public static void main(String[] args) {
		System.out.println("UNSORTED ARRAY");
		printArray();
		quickSort(A, 0, n-1);
		System.out.println("\nSORTED ARRAY");
		printArray();
	}

	private static void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int pivot = partition(a, low, high);
			quickSort(a, low, pivot - 1);
			quickSort(a, pivot + 1, high);
		}		
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low;
		for (int j = low; j < high; j ++) {
			if (a[j] <= pivot) {
				swap(i, j);
				i ++;
			}
		}
		swap(i, high);
		return i;
	}

	private static void swap(int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	private static void printArray() {
		for(int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		
	}

}
