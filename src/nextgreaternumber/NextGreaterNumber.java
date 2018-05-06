package nextgreaternumber;

import java.util.Arrays;

public class NextGreaterNumber {

	public static void main(String[] args) {
		int n = 230241;
		System.out.println(nextGreaterElement(n));

	}
	
	public static int nextGreaterElement(int n) {
		String s = n + "";
        char[] ca = s.toCharArray();
        int index1 = -1;
        for (int i = ca.length - 1; i > 0; i--) {
            if (ca[i] > ca[i - 1]) {
                index1 = i - 1;
                break;
            }
        }
        if (index1 == -1)
            return index1;
        int nextMin = Integer.MAX_VALUE;
        int index2 = -1;
        for (int i = index1 + 1; i < ca.length; i ++) {
            if (ca[i] > ca[index1] && ca[i] < nextMin) {
                nextMin = ca[i];
                index2 = i;
                
            }
        }
        char temp = ca[index1];
        ca[index1] = ca[index2];
        ca[index2] = temp;
        Arrays.sort(ca, index1 + 1, ca.length);
        long result = Long.parseLong(new String(ca));
        return (result <= Integer.MAX_VALUE) ? (int) result : -1;
    }

}
