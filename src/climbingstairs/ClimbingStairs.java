package climbingstairs;

public class ClimbingStairs {
	public static void main(String args[]) {
		System.out.println(climbStairs(44));
	}
	public static int climbStairs(int n) {
    	if (n == 0)
        	return 0;
    	if (n == 1)
        	return 1;
    	if (n == 2)
        	return 2;
    	/*int firstVal = 1; int secondVal = 2;
    	int count = 0;
    	for (int i = 3; i <= n; i++) {
        	count = firstVal + secondVal;
        	firstVal = secondVal;
        	secondVal = count;
    	}
    	return count;*/
    	return climbStairs(n - 1) + climbStairs(n - 2);
	}
}
