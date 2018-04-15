package makenumbersmatch;
public class MakeNumbersMatch {
	public static void main(String[] args) {
		MakeTheNumbersMatch(5, 8, 20, 0);
	}
	public static void MakeTheNumbersMatch(int a, int b, int x, int y) {
		while(a != x) {
			if (a > x)
				a --;
			else
				a ++;
		}
		while(b != y) {
			if (b > y)
				b --;
			else
				b ++;
		}
		System.out.println(a);
		System.out.println(b);
	}
}
