package repeatedsubtringpattern;

public class RepeatedSubstringPattern {
	public static void main(String args[]) {
		String str = "abcabcabcabc";
		System.out.println(repeatedSubstringPattern(str));
	}

	private static boolean repeatedSubstringPattern(String str) {
		int len = str.length();
		for (int i = len/2; i >=1; i --) {
			if (len % i == 0) {
				int m = len/i;
				String subString = str.substring(0, i);
				StringBuilder newString = new StringBuilder();
				for (int j = 0; j < m; j++) {
					newString.append(subString);
				}
				if (newString.toString().equals(str)) return true;
			}
		}
		return false;
	}
}
