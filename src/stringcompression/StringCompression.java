package stringcompression;
public class StringCompression {
	private static char[] chars = {'a','a','b','b','c','c','c'};
	public static void main(String[] args) {
		for (char c : chars)
			System.out.println(c);
		System.out.println(stringComp());
		for (char c : chars)
			System.out.println(c);
	}

	private static int stringComp() {
		int start = 0;
		for (int end = 0, count = 0; end < chars.length; end ++) {
			count ++;
			if (end == chars.length - 1 || chars[end] != chars[end + 1]) {
				chars[start] = chars[end];
				start ++;
				if (count != 1) {
					char[] countArr = String.valueOf(count).toCharArray();
					for (char c : countArr) {
						chars[start] = c;
						start ++;						
					}
				}
				count = 0;
			}
		}
		return start;
	}

}
