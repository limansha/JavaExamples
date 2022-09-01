package algo.dynamicPgming.LCS;

import java.util.Arrays;

public class LongestCommonSubString {
	//Substring means the part of the string should be ordered and continous
	public static void main(String[] args) {
		String A = "abcdaf";
		String B = "acbcf";
		System.out.println(countLCSubStringTabulation(A, B));
	}

	private static int countLCSubStringTabulation(String s1, String s2) {
		//as maxSubString can be in any place
		int m = s1.length();
		int n = s2.length();
		int [][]t = new int[m+1][n+1];
		for(int i = 0;i<m;i++) { //base condition
			for(int j=0;j<n;j++) {
				if(i == 0 || j == 0) t[i][j] = 0;
			}
		}
		for(int i = 1;i<=m;i++) { 
			for(int j=1;j<=n;j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					t[i][j] = 1 + t[i-1][j-1];
				}
				else {
					t[i][j] = 0;
				}
			}
		}
		for (int[] r : t) {
			System.out.println(Arrays.toString(r));
		}
		int max = 0;
		for(int i = 1;i<=m;i++) { 
			for(int j=1;j<=n;j++) {
				if(t[i][j] > max) max = t[i][j];
			}
		}
		return max;
	}

}
