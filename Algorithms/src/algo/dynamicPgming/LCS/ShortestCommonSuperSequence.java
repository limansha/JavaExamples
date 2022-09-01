package algo.dynamicPgming.LCS;

import java.util.Arrays;

public class ShortestCommonSuperSequence {

	String a = "geek";
	String b = "eke";
	// find the string (super sequence) which has both a b as a subsequence we get
	// multiple strings like concat a+b = geekeke will have a,b as subsequence .
	// but the string (super sequence) should be the smallest valid string having
	// both a b as a subsequence
	// ans is geeke i.e 5 return the length of shortest SuperSequence

	// Ex2
	static String a1 = "AGGTAB";
	static String b1 = "GXTXAYB";

	// ans should be while blindly thinking as it accepts subsequence we only mind
	// the order AGGXTXAYB
	// that is nothing but we are removing LCS as they will be added twice when we
	// sum len(a1 + b1) sequence in a1 and b1 so we remove one sequence as they
	// overlap in resultant sequence.
	// LCS is GTAB len = 4
	// a1 len = 6 b1 len = 7
	// a1 + b1 - LCS = 6 + 7 - 4 = 9 (AGGXTXAYB)
	public static void main(String[] args) {
		int m = a1.length();
		int n = b1.length();
		int lcs = countLcsTabulation(a1, b1);
		System.out.println(m + n - lcs);
	}

	public static int countLcsTabulation(String s1, String s2) {

		int m = s1.length();
		int n = s2.length();
		int[][] t1 = new int[m + 1][n + 1];
		for (int i = 0; i < m; i++) { // base condition
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					t1[i][j] = 0;
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					t1[i][j] = 1 + t1[i - 1][j - 1];
				} else {
					t1[i][j] = Math.max(t1[i - 1][j], t1[i][j - 1]);// be careful with the idx i,j
				}
			}
		}
//		for (int[] r : t1) {
//			System.out.println(Arrays.toString(r));
//		}
		return t1[m][n];
	}
}
