package longestnonrepeatingstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatingSubString {

	public static void main(String[] args) {
		String s = "ckilbkd";
		System.out.print(lengthOfLongestSubstring(s));

	}
    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        int count = 0;
        if (s == null) {
        	return 0;
        }
    	char a[] = s.toCharArray();
    	
       Set<Character> set = new HashSet<>();
       int i = 0, j = 0;
       while (i < a.length && j < a.length) {
           if (!set.contains(a[j])){
               set.add(a[j++]);
               len = Math.max(len, j - i);
           }
           else {
               set.remove(a[i++]);
           }
       }
    // Alternate
       /*
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length; i ++) {
        	if (map.containsKey(a[i])) {
        		count = Math.max(map.get(a[i]), count);
        	}
        	len = Math.max(len,  i - count + 1);
        	map.put(a[i], i + 1);
        }*/
        return len;
    }
}
