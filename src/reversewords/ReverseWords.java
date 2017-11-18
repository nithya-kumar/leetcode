package reversewords;
public class ReverseWords {
	public static void main(String args[]) {
		String s = "   a   b ";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) {
        s = s.trim();
        if (s.equals("") || s.equals(" "))
            return "";
        if (s.length() == 1) 
            return s;
        String[] strArray = s.split("\\s+");
        String reverse = new String();
        for (int i = strArray.length - 1; i > 0; i --)
        	reverse += strArray[i] + " ";
        reverse += strArray[0];
        return reverse;
    }
}