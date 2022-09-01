package algo.dynamicPgming.LCS;

public class PrintShortestCommonSuperSequence {
	// ans should be while blindly thinking as it accepts subsequence we only mind
	// the order AGGXTXAYB
	// Ex2
		static String a1 = "AGGTAB";
		static String b1 = "GXTXAYB";
	public static void main(String[] args) {
		int m = a1.length();
		int n = b1.length();
		int lcs = countLcsTabulation(a1, b1);
		System.out.println(m + n - lcs); //gives count 
		
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
		
		//printing SCS
		int i = m;
		int j = n;
		StringBuilder sb = new StringBuilder();
		while(i > 0 && j>0) {//if any one string becomes empty it comes out of the loop
			if(s1.charAt(i-1) == s2.charAt(j-1)) {
				sb.append(s1.charAt(i-1));
				i--;
				j--;
			}
			else {
				if(t1[i-1][j] > t1[i][j-1]) {
					sb.append(s1.charAt(i-1));
					i--;
				}
				else {
					sb.append(s2.charAt(j-1));
					j--;
				}
			}
		}
		while(i > 0) { //when there are remaining chars in string 1
			sb.append(s1.charAt(i-1));
			i--;
		}
		while(j > 0) { //when there are remaining chars in string 2
			sb.append(s2.charAt(j-1));
			j--;
		}
		System.out.println(sb.reverse().toString());
		return t1[m][n];
	}
}
