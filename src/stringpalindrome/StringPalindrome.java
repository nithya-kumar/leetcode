package stringpalindrome;
import java.util.HashSet;
import java.util.Set;

public class StringPalindrome {

	public static String str = "abc";
	public static char[] strArray = str.toCharArray();
	public static int strLen = strArray.length;
	public static Set<String> palSet = new HashSet<String>();
	
	public static void main(String args[]) {
		permute(strArray, 0, strLen - 1);
		for (String s : palSet)
		System.out.println(s);
	}

	private static void permute(char[] str, int l, int r) {
		if (l == r) {
			palSet.add(new String(str));
		//	System.out.println(new String(str));
		}
		else {
			for(int  i = l; i <= r; i++) {
				swap (l, i);
				permute (str, l + 1, r);
				swap (l, i);
			}
		}
	}

	private static void swap(int index1, int index2) {
		char temp = ' ';
		temp = strArray[index1];
		strArray[index1] = strArray[index2];
		strArray[index2] = temp;
	}

}
