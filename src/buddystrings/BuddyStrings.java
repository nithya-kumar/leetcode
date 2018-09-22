package buddystrings;

import java.util.Arrays;

public class BuddyStrings {
	public static void main(String args[]) {
		String A = "abab";
		String B = "abab";
		System.out.println(buddyStrings(A, B));
	}
	public static boolean buddyStrings(String A, String B) {
		int len1 = A.length();
        int len2 = B.length();
      
        // Return false if both are not of equal length
        if (len1 != len2)
            return false;
      
        // To store indexes of previously mismatched
        // characters
        int prev = -1, curr = -1;
      
        int count = 0;
        for (int i=0; i<len1; i++)
        {
            // If current character doesn't match
            if (A.charAt(i) != B.charAt(i))
            {
                // Count number of unmatched character
                count++;
      
                // If unmatched are greater than 2,
                // then return false
                if (count > 2)
                    return false;
      
                // Store both unmatched characters of
                // both strings
                prev = curr;
                curr = i;
            }
        }
      
        // Check if previous unmatched of string1
        // is equal to curr unmatched of string2
        // and also check for curr unmatched character,
        // if both are same, then return true
        return (count == 2 &&
                A.charAt(prev) == B.charAt(curr) &&
                A.charAt(curr) == B.charAt(prev));
    }
}
