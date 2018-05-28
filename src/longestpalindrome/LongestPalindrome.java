package longestpalindrome;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/longest-palindrome/description/
 */
public class LongestPalindrome {
	public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ca = s.toCharArray();
        int len = 0;
        for (char c : ca) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                len ++;
                map.remove(c);
            }
        }
        if (map.isEmpty())
            return len * 2;
        return (len * 2) + 1;
    }
}
