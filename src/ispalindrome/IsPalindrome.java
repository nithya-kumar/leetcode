package ispalindrome;
public class IsPalindrome {
	public static void main(String[] args) {
		int num = 123211;
		System.out.println(isPalindrome(num));
	}

	private static boolean isPalindrome(int x) {
		int rev = 0;
		if (x < 0 || (x != 0 && x%10 == 0))
			return false;
		while (x > rev) {
			rev = rev * 10 + (x % 10);
			x = x/10;
		}
		return (x == rev || x == rev/10);
	}
}
