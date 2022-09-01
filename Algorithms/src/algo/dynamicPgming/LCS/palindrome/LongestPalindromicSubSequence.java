package algo.dynamicPgming.LCS.palindrome;

import java.util.Arrays;

//has many variations of the same problem
public class LongestPalindromicSubSequence {

	public static void main(String[] args) {
		// for a given string find the longest palindromic subsequence
		String ip = "agbcba";
		/*
		 * palindromes formed are b,bab,abcab ans = longest i.e abcab i.e length 5
		 */
		// in short this problem is equal to LCS
		// LPS === LCS(ip, reverse of ip)
		StringBuilder sb = new StringBuilder();
		sb.append(ip);
		String revip = sb.reverse().toString();
		// System.out.println(revip);
		int lenOfPalindrome = countLcsTabulation(ip, revip);
		System.out.println(lenOfPalindrome);
	}

	public static int countLcsTabulation(String s1, String s2) {
		//System.out.println(s1 + "  "+ s2);
		int m = s1.length();
		int n = s2.length();
		int[][] t = new int[m + 1][n + 1];
		for (int i = 0; i < m; i++) { // base condition
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					t[i][j] = 0;
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					t[i][j] = 1 + t[i - 1][j - 1];
				} else {
					t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);// be careful with the idx i,j
				}
			}
		}
//		for (int[] r : t) {
//			System.out.println(Arrays.toString(r));
//		}
		return t[m][n];
	}

}
