package permutationinstring;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
	static Map<Character, Integer> s1FreqMap;
    static Map<Character, Integer> globalMap = new HashMap<Character, Integer>();
    static int s1Len = 0;
    static int s2Len = 0;
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "ooolleoooleh";
		System.out.println(checkInclusion(s1, s2));
	}
    public static boolean checkInclusion(String s1, String s2) {
    	if (s1 == null || s2 == null) {
            return false;
        }
        s1Len = s1.length();
        s2Len = s2.length();
        if (s1Len > s2Len) {
            return false;
        }
        for (char c : s1.toCharArray()) {
            globalMap.put(c, globalMap.getOrDefault(c, 0) + 1);
        }
        
        s1FreqMap = new HashMap(globalMap);
        
        if (checkPermutation(s2.substring(0, s1Len), true)) {
            return true;
        }
        
        for (int i = 1; i <= s2Len - s1Len; i ++) {
            if (checkPermutation(s2.substring(i, i + s1Len), false)) {
                return true;
            }
        }
        
        return false;         
    }
    public static boolean checkPermutation(String subString, boolean isFirst) {
    	if (isFirst) {
            for (char c : subString.toCharArray()) {
                if (s1FreqMap.containsKey(c)) {
                    if (s1FreqMap.get(c) != 0) {
                        s1FreqMap.put(c, s1FreqMap.get(c) - 1);
                    } else {
                    	s1FreqMap = new HashMap(globalMap);
                    }
                } else {
                    s1FreqMap = new HashMap(globalMap);
                }
            }
        } else {
            char newIncomingChar = subString.charAt(s1Len - 1);
            if (s1FreqMap.containsKey(newIncomingChar)) {
                if (s1FreqMap.get(newIncomingChar) != 0) {
                    s1FreqMap.put(newIncomingChar, s1FreqMap.get(newIncomingChar) - 1);
                } else {
                	s1FreqMap = new HashMap(globalMap);
                }
            } else {
                s1FreqMap = new HashMap(globalMap);
            }
        }
        for (int val : s1FreqMap.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

}
