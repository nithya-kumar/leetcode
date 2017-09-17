package reverseinteger;
public class ReverseInteger {

	public static void main(String[] args) {
		int num = 1000000003;
		System.out.println(reverse(num));
	}

	private static int reverse(int x) {
		int rev = 0, pre_rev = 0;
		boolean flag = false;
		if (x < 0) {
			x = -1 * x;
			flag = true;
		}
		while (x > 0) {
			int curr = x % 10;
			rev = rev * 10 + curr;
			if ((rev - curr)/10 != pre_rev)
				return 0;
			x = x/10;
			pre_rev = rev;
		}
		return (flag == true)? -rev : rev;
	}

}
