package adddigits;
public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(1244444));
	}

	public static int addDigits(int num) { 
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));
    }
}
