package reversestring;
public class ReverseString {
	private static char[] str = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
	public static void main(String[] args) {
		reverseWords();
		for (char c : str) {
			System.out.println(c + ",");
		}

	}
	
	public static void reverseWords() {
		swap (0, str.length - 1);
        int l = 0;
        for (int i = 0; i < str.length; i ++) {
            if (str[i] == ' ') {
                swap(l, i-1);
                l = i + 1;
            }
        }
        swap (l, str.length - 1);
    }
    public static void swap (int l, int r) {
        while (l < r) {
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l ++; r --;
        }
    }

}
