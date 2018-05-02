package textjustification;

public class TextJustification {

	public static void main(String[] args) {
		String words[] = {"Science","is","what","we","understand","well","enough","to","explain", "to","a","computer.","Art","is","everything","else","we","do"};
		int maxWidth = 20;
		List<String> fullJust = fullJustify(words, maxWidth);
	}

}
