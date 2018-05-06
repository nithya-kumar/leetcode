package splittext;

import java.util.ArrayList;
import java.util.List;

public class SplitText {

	public static void main(String[] args) {
		String s = "Hey Nithya your Uber is arriving now!";
		int limit = 10;
		List<String> result = new ArrayList<String>();
		result = splitText(s, limit);
		System.out.println(result);
	}

	private static List<String> splitText(String s, int limit) {
		List<String> result = new ArrayList<String>();
		int start = 0;
		while(start + limit < s.length()) {
			int index = start + limit;
			while (s.charAt(index) != ' ') {
				index --;
			}
			result.add(s.substring(start, index));
			start = index + 1;				
		}
		result.add(s.substring(start, s.length()));
		return result;
	}

}
