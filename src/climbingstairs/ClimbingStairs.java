package climbingstairs;

public class ClimbingStairs {
	public int climbStairs(int n) {
    	if (n == 0)
        	return 0;
    	if (n == 1)
        	return 1;
    	if (n == 2)
        	return 2;
    	int firstVal = 1; int secondVal = 2;
    	int count = 0;
    	for (int i = 3; i <= n; i++) {
        	count = firstVal + secondVal;
        	firstVal = secondVal;
        	secondVal = count;
    	}
    	return count;
	}
}
