package wordbreak;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		String s = "aaaaaaa";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("aaaa");
		wordDict.add("aaa");
		System.out.println(wordBreak(s, wordDict));

	}
	
	public static boolean wordBreak(String s, List<String> wordDict) {
        int start = 0, end = 0;
        boolean res = false;
        while (end < s.length()) {
        	System.out.println("START" + start);
        	System.out.println("END" + end);
            res = isInDict(s.substring(start, end + 1), wordDict);
            System.out.println("RESULT" + res);
            if (res) {
            	res = false;
            	while (!res) {
                    end = end + 1;
                }
                start = end + 1; end = end + 1;
            } else {
                end = end + 1;
            }
        }
        return res;
    }
    
    public static boolean isInDict(String s, List<String> wordDict) {
    	System.out.println("STRING" + s);
        return wordDict.contains(s);
    } 

}
