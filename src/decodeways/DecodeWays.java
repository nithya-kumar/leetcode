package decodeways;

public class DecodeWays {

	public static void main(String[] args) {
		String s = "226";
		System.out.println(numDecodings(s));
	}

	private static int numDecodings(String s) {
		if (s == null)
            return 0;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        if (s.charAt(0) != '0')
        	dp[1] = 1;
        for (int i = 2; i <= s.length(); i ++) {
            int oneChar = Integer.parseInt(s.substring(i - 1, i));
            int twoChar = Integer.parseInt(s.substring(i - 2, i));
            if (oneChar != 0)
                dp[i] += dp[i - 1];
            if (twoChar >= 10 && twoChar <= 26)
                dp[i] += dp[i - 2];
        }
		return dp[s.length()];
	}
	
	

}
