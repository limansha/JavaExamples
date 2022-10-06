package algo.dynamicPgming;

import java.util.Arrays;

public class MaxSumOfNonAdjacentElements {

	static int max =0;
	public static void main(String[] args) {
		int []ip = new int[] {2,1,4,9}; //op = 11
		int n = 4;
		int []dp = new int [n+1];
		Arrays.fill(dp, -1);
		System.out.println(maxSumOfNonAdjacentRecursion(ip,n-1));
		System.out.println(maxSumOfNonAdjacent(ip,n-1,dp));
		System.out.println(maxSumOfNonAdjacentBest(ip,n-1));
	}

	private static int maxSumOfNonAdjacentRecursion(int[] ip, int n) {
		if(n == 0) return ip[n];
		if(n < 0) return 0;
		int case1 = 0;
		case1 = Math.max(ip[n]+ maxSumOfNonAdjacentRecursion(ip,n-2),maxSumOfNonAdjacentRecursion(ip,n-1));
		
		max = Math.max(max, case1);
		return max;
	}
	private static int maxSumOfNonAdjacent(int[] ip, int n,int[] dp) {
		if(n == 0) return ip[0];
		if(n < 0) return 0;
		if(dp[n] != -1) return dp[n];
		return dp[n] = Math.max(ip[n]+ maxSumOfNonAdjacent(ip,n-2,dp),maxSumOfNonAdjacent(ip,n-1,dp));
	}
	//tabulation
	private static int maxSumOfNonAdjacentBest(int[] ip, int n) {
		//only iteration
		int []dp =new int[n+1];
		Arrays.fill(dp, 0);
		//Bc
		dp[0] = ip[0];
		int neg =0;//if there are negative idx we add zero
		for(int i=1;i<=n;i++) {
//			int take = ip[i] + dp[i-2];
//			int nonTake =  0 + dp[i-1];
//			dp[i] = Math.max(take, nonTake);

			//to satisfy negative edge case
			
			int take = ip[i] ;
			if(i > 1) {
				take+=dp[i-2];
			}
			int nonTake =  0 + dp[i-1];
			dp[i] = Math.max(take, nonTake);
			
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
	}
		
}
