package algo.dynamicPgming.LCS;

import java.util.Arrays;

public class PrintLCSubsequence {

	public static void main(String[] args) {
		String B = "abcdaf";
		String A = "acbcf";
		System.out.println(countLcsTabulation(A, B));
	}

	public static int countLcsTabulation(String s1, String s2) {

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
		for (int[] r : t) {
			System.out.println(Arrays.toString(r));
		}
		StringBuilder sb = new StringBuilder();
		int i = m;
		int j = n;
		//printing sub sequence 
		while(i > 0 && j > 0) {
		if(s1.charAt(i-1) ==s2.charAt(j-1)) {
					sb.append(s1.charAt(i-1)); //after matching move diagonal
					i--;
					j--;
				}
				else {// if not matched find max of adjacent going reverse of top down approach
					if(t[i-1][j] > t[i][j-1]) {
						i--;
					}
					else {
						j--;
					}
			}
		}
		sb.reverse();
		System.out.println(sb.toString());
		return t[m][n];
	}

}
