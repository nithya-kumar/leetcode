package sumoftwointegers;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		int num1 = 123, num2 = 458;
		int sum = findSum(num1, num2);
		System.out.println(sum);
	}

	private static int findSum(int num1, int num2) {
		if (num1 == 0)
			return num2;
		if (num2 == 0)
			return num1;
		int carry = 0, counter = 1, num3 = 0;
		while (num1 > 0 || num2 > 0) {
			int sum = 0;
			int digit1 = 0, digit2 = 0;
			if (num1 > 0) {
				digit1 = num1 % 10;
				num1 = num1 / 10;
			}
			if (num2 > 0) {
				digit2 = num2 % 10;
				num2 = num2 / 10;				
			}
			sum = carry + digit1 + digit2;
			carry = (sum > 10) ? 1 : 0;
			sum = sum % 10;
			num3 += counter * sum;
			counter = counter * 10;
		}
		if (carry == 1)
			num3 += counter;
		return num3;
	}
}
