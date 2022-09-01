package algo.dynamicPgming.LCS.palindrome;

import java.util.Arrays;

//this problem is similar to Minimum number of insertion in a string to make it a palindrome 
//because they are asking for the minimum insertion count
public class FindMinDeletnsToMakeStringPalindrome {

	public static void main(String[] args) {
		String ip = "agbcba";
		/*
		 * Longest palindrome will make minimal deletions 
		 */
		// in short this problem is equal to LCS
		// LPS === LCS(ip, reverse of ip)
		StringBuilder sb = new StringBuilder();
		sb.append(ip);
		String revip = sb.reverse().toString();
		int lcs = countLcsTabulation(ip,revip);
		int ans = ip.length() - lcs; //the chars which are not in Longest palindrome are the minimum deletion made to make a string palindrome 
		System.out.println("number of deletions to make a string "+ip+" palindrome " +ans);
	}
public static int countLcsTabulation(String s1, String s2) {
		
		int m = s1.length();
		int n = s2.length();
		int[][] t1 = new int[m+1][n+1];
		for (int i = 0; i < m; i++) { // base condition
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					t1[i][j] = 0;
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					t1[i][j] = 1 + t1[i - 1][j - 1];
				}
				else {
					t1[i][j] = Math.max(t1[i - 1][j], t1[i][j - 1]);//be careful with the idx i,j
				}
			}
		}
//		for (int[] r : t1) {
//			System.out.println(Arrays.toString(r));
//		}
		return t1[m][n];
	}

}
