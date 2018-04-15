package changeKthBit;
public class ChangeKthBit {

	public static void main(String[] args) {
		int n = 13;
		int k = 2;
		System.out.println(changeKthBit(n, k));
	}

	private static int changeKthBit(int n, int k) {
		if (k <= 0) 
            return n;
		return (n & ~(1 << (k - 1)));
	}

}