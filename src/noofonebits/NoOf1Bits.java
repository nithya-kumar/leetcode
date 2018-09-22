package noofonebits;

public class NoOf1Bits {

	public static void main(String args[]) {
		int count = 0;
		unsigned int n = 2147483648;
        while(n > 0) {
            count += n & 1;
            n = n >> 1;
            System.out.println(n);
        }
        return count;
	}
}
