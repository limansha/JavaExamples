package algo.dynamicPgming;

import java.util.Arrays;

public class HouseRobber {
	static int max = 0;
	public static void main(String[] args) {
		int []ip = new int[] {2,3,2}; //op = 3 not 4 as its circular so idx 0 house is adjacent to idx 3
		int n = 3;
		//here push houses from 1 to n-1 into one array and get the max 
		//push all the houses from 0 to n-2 (leaving n-1 last house) 
		//find the max of both houses
		int []ip1 = new int[] {1,3,2,1}; //op = 4
		int n1 = 4;
		int []dp = new int [n+1];
		Arrays.fill(dp, -1);
		System.out.println(maxSumOfNonAdjacentRecursion(ip,n-1));
		System.out.println(maxSumOfNonAdjacent(ip,n-1,dp));
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
}
