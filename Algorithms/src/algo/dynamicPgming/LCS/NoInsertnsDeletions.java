package algo.dynamicPgming.LCS;

import java.util.Arrays;

public class NoInsertnsDeletions {

	public static void main(String[] args) {
		//Minimum Number of Insertion and Deletion to convert String a to String b
		String a = "heap";
		String b = "pea";
		//find the minimum number of insertns and deletions we need to make to convert the heap into pea 
		//ans 3 i.e one insertion p 
		//a = pheap 
		//2 deletions h and p
		//results in a = pea.
		
		/*
		 * if we closely observe the LCS of both strings is "ea" 
		 * to find Minimum Number of Insertion and Deletion to convert String a to String b
		 * so from  a remove other chars not in LCS which gives deletion count 
		 * from b check how many chars are remaining which are not in LCS are to be inserted to a   gives insertion count
		 * */
		int lcs = countLcsTabulation(a,b);
		int insertions = b.length()-lcs; //chars not in a but present in b
		int deletions = a.length()-lcs; // chars not in b but present in a
		System.out.println("Minimum number of Insertions are "+insertions+" and deletions are "+ deletions);
	}
	public static int countLcsTabulation(String s1, String s2) {
		
		int m = s1.length();
		int n = s2.length();
		int[][] t = new int[m+1][n+1];
		for (int i = 0; i < m; i++) { // base condition
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					t[i][j] = 0;
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					t[i][j] = 1 + t[i - 1][j - 1];
				}
				else {
					t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);//be careful with the idx i,j
				}
			}
		}
//		for (int[] r : t) {
//			System.out.println(Arrays.toString(r));
//		}
		return t[m][n];
	}
}
