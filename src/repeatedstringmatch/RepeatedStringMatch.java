package repeatedstringmatch;

public class RepeatedStringMatch {

	public static void main(String args[]) {
		String A = "baaaabbbba";
		String B = "bbaaaabbbbaabaaaabbbbaabaaaabbbbaabaaaabbbbaabaaaabbbbabbaaaabbbbabbaaaabbbbabbaaaabbbbabbaaaabbbbaa";
		System.out.println(repeatedStringMatch(A, B));
	}
	
	public static int repeatedStringMatch(String A, String B) {
        if (A == null || A.length() == 0 || B == null || B.length() == 0) {
            return -1;
        }
        int count = 0;
        String concatStr = A;
        while (concatStr.length() < 10000) {
            count ++;
            if (isSubstring(concatStr, B)) {
                return count;
            } else {
                concatStr = concatStr.concat(A);
            }
        }
        return -1;
    }
    
    private static boolean isSubstring(String A, String B) {
        for (int i = 0; i <= A.length() - B.length(); i ++) {
            String subString = A.substring(i, i + B.length());
            if (subString.equals(B)) {
                return true;
            }
        }
        return false;
    }
}
