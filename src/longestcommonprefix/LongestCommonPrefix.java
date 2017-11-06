package longestcommonprefix;

/* 
 * Worst case Time Complexity O(n * m) where 
 * n = total number of strings in the input array and m = length of smallest string in the array
 */

/* 
 * Worst case Space Complexity O(1)
 */

/* 
 * More test cases are in LongestCommonPrefixTest.java
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strings = {"telecom", "telephone", ""};
		System.out.println(longestCommonPrefix(strings));
	}
	
	public static String longestCommonPrefix(String[] strings) {
		int length = strings.length;
	    if(length == 0)
	    	return "Input is null";
	    
	    /* 
	     * Find the string with minimum length. 
	     * Why? Because, the longest common prefix cannot exceed the length of the min length string
	     */
	    
	    String minLengthString = strings[0];
	    for (String s : strings) {
	    	if (s.length() < minLengthString.length())
	    		minLengthString = s;
	    }
	    StringBuilder builder = new StringBuilder(minLengthString);
	    
	    /* 
	     * Check through all the strings if the string starts with the min length string.
	     * If not, delete one character from the end of the min length string.
	     */
	    for(String s : strings) {
	        while(!s.equals(minLengthString) && !s.startsWith(builder.toString()))
	        	builder.deleteCharAt(builder.length() - 1);
	    }
	    if (builder.toString().equals(""))
	    	return "No common prefix";
	    return builder.toString();
	}
}

/*
 * I referred online for usage of few StringBuilder methods but came up with logic of my own.
 * I felt this would be the most optimal solution for the problem.
 */
