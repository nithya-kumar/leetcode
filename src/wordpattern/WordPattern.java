package wordpattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";
		System.out.println(wordPattern(pattern, str));
	}
	
	public static boolean wordPattern(String pattern, String str) {
        Map<Character, String> patMap = new HashMap<Character, String>();
        char[] patternArr = pattern.toCharArray();
        String[] strArr = str.split(" ");
        if (patternArr.length != strArr.length)
            return false;
        for (int i = 0; i < strArr.length; i ++) {
            if (patMap.get(patternArr[i]) == null) {
                if (patMap.containsValue(strArr[i]))
                    return false;
                patMap.put(patternArr[i], strArr[i]);
            } else {
                if (!(patMap.get(patternArr[i])).equals(strArr[i]))
                    return false;
            }
        }
        return true;
    }

}
