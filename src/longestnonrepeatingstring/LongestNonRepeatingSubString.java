package longestnonrepeatingstring;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSubString {

	public static void main(String[] args) {
		String s = "aab";
		System.out.print(lengthOfLongestSubstring(s));

	}
    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        int count = 0;
        if (s == null) {
        	return 0;
        }
    	char a[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length; i ++) {
        	if (! map.containsKey(a[i]) || map.get(a[i]) == 0) {
        		count ++;
        	} else {
        		if (a[i] == a[i - 1]) {
        			count = 1;
        		}
        	}
        	map.put(a[i], 1);
        	if (len < count)
        		len = count;
        }
        return len;
    }
}
