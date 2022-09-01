package algo.dynamicPgming.LCS;

import java.util.Arrays;

public class LongestCommonSubSequence {
	static String A = "abcdaf";
	static String B = "acbcf"; // ans = 4 // a|0b|2c|3f|4 c at idx 1 is omitted as order not followed
	static int[][] t = new int[A.length()][B.length()];
	

	public static void main(String[] args) {
		// given to strings a, b find the longest subsequence (i.e order is followed ,
		// can be discontinous) length in a,b
		for (int[] r : t) {
			Arrays.fill(r, -1);
		}
		System.out.println(countLcsRecursion(A, B, 0, 0));
		System.out.println(countLcsMemorization(A, B, 0, 0));
		for (int[] r : t) {
			System.out.println(Arrays.toString(r));
		}
		
		System.out.println(countLcsTabulation(A, B));
		
	}

	public static int countLcsRecursion(String s1, String s2, int idx1, int idx2) {

		if (idx1 == s1.length() - 1 || idx2 == s2.length() - 1) {
			return 0; // base Condtn
		}
		if (s1.charAt(idx1) == s1.charAt(idx2)) {

			return 1 + countLcsRecursion(s1, s2, idx1 + 1, idx2 + 1);
		}

		return Math.max(countLcsRecursion(s1, s2, idx1 + 1, idx2), countLcsRecursion(s1, s2, idx1, idx2 + 1));
	}

	public static int countLcsMemorization(String s1, String s2, int idx1, int idx2) {
		if (t[idx1][idx2] != -1)
			return t[idx1][idx2];

		if (idx1 == s1.length() - 1 || idx2 == s2.length() - 1) {
			return 0; // base Condtn
		}
		if (s1.charAt(idx1) == s1.charAt(idx2)) {

			return t[idx1][idx2] = 1 + countLcsMemorization(s1, s2, idx1 + 1, idx2 + 1);
		}

		return t[idx1][idx2] = Math.max(countLcsMemorization(s1, s2, idx1 + 1, idx2),
				countLcsMemorization(s1, s2, idx1, idx2 + 1));
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
		for (int[] r : t1) {
			System.out.println(Arrays.toString(r));
		}
		return t1[m][n];
	}

}
