package snakesandladders;

public class SnakesAndLadders {

	public static void main(String[] args) {
		int[][] snakes = {{99, 78}, {95, 75}, {93, 73}, {87, 24}, {64, 60}, {62, 19}, {54, 34}, {17, 7}};
	    int[][] ladders = {{4, 14}, {9, 31}, {20, 38}, {28, 84}, {51, 67}, {63, 81}, {71, 91}};

		int m = minThrowsDP(snakes, ladders);
		System.out.println(m);
	}

	public static int minThrowsDP(int[][] snakes, int[][] ladders){
		int[] dp = new int[101];
		for(int i = 7; i < 101; i++){
			dp[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 7; i <= 100; i++){
			for(int k = 1; k <= 6; k++){
				dp[i] = Math.min(dp[i], dp[i-k]+1);
			}
			for (int p = 0; p < ladders.length; p++){
				if (ladders[p][0] == i){
					dp[ladders[p][1]] = dp[i];
				}
			}
		}
	    return dp[100];		
	}
}
