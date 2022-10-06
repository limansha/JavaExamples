package algo.dynamicPgming;

import java.util.Arrays;

public class FibonacciSequence {
//simple Dp
	public static void main(String[] args) {
		int n = 100; // return first 5 numbers in fibonnaci
		long dp[] = new long[n];
		dp[0] = 0;
		dp[1] = 1; //BC
		for(int i=2;i<n;i++) {
			dp[i] = dp[i-1]+dp[i-2]; //prev and next prev
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(fibonaaciRecursive(n));
	}

private static char[] fibonaaciRecursive(int n) {
	// will give TLE
	return null;
}

}
