package algo.dynamicPgming.LCS;

import java.util.Arrays;

public class LongestRepeatingSubSequence {

	public static void main(String[] args) {
		//we need to find the longest subsequence which is repeated i,e ABD
		String a = "AABEBCDD";
		//a = a1 = a2
		//we can achieve the length of this by doing LCS(a1,a2);
		//where we eliminate characters which are at same positions of a1,a2 that means they are occuring only once in the string
		System.out.println(countLcsTabulation(a, a));
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
				if (s1.charAt(i-1) == s2.charAt(j-1) && i != j ) { // i != j is important here as we are comparing string with itself 
					t1[i][j] = 1 + t1[i - 1][j - 1];
				}
				else {
					t1[i][j] = Math.max(t1[i - 1][j], t1[i][j - 1]);
				}
			}
		}
//		for (int[] r : t1) {
//			System.out.println(Arrays.toString(r));
//		}
		return t1[m][n];
	}

}
