package palindromicsubstring;
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String s = "sncjsnctcvuxjxuvctcniisncksjn";
		System.out.println(longestPalindromicSubstring(s));
	}

	private static String longestPalindromicSubstring(String s) {
		String longestPalindromicSubstring = null;
		int length = s.length();
		int maxLength = 1;
		int start = 0;
		int l, r;
		for (int i = 1; i < length; i ++) {
			l = i - 1;
			r = i + 1;
			while (l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
				if (r - l + 1 > maxLength) {
					maxLength = r - l + 1;
					start = l;
				}
				l --;
				r ++;
			}
			l = i - 1; 
			r = i;
			while (l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
				if (r - l + 1 > maxLength) {
					maxLength = r - l + 1;
					start = l;
				}
				l --;
				r ++;
			}
		}
		longestPalindromicSubstring = s.substring(start, start + maxLength);
		return longestPalindromicSubstring;
	}

}
