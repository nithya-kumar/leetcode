package reverseeachword;
public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "geeks code new";
		System.out.println(reverseEachWord(str));

	}

	private static String reverseEachWord(String str) {
		String[] words = str.split(" ");
		String revString = "";
		for (int i = 0; i < words.length; i ++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
		revString = revString + revWord + " ";
		}
		
		return revString;
	}

}