package algo.dynamicPgming.MCM;

public class CountBooleanParenthesisation {

	public static void main(String[] args) {
		String expression = "T|T&F^T";// ans = 4
		System.out.println(countWaysToTrue(expression));
	}

	private static int countWaysToTrue(String expression) {
		int i = 0;
		int j = expression.length() - 1;
		char isTrue = 'T';
		return solve(expression, i, j, isTrue);
	}

	private static int solve(String expression, int i, int j, char isTrue) {
		// BC
		if (i > j)
			return 0;
		if (i == j) {
			if (expression.charAt(i) == isTrue)
				return 1;
			else
				return 0;
		}
		
		int ans = 0;
		for(int k=i+1;k<=j-1;k=k+2) {
			//System.out.println("i = "+i+ " j = "+ j+ " k "+k );
			int lt = solve(expression,i,k-1,'T');
			int lf = solve(expression,i,k-1,'F');
			int rt = solve(expression,k+1,j,'T');
			int rf = solve(expression,k+1,j,'F');
			
			if(expression.charAt(k) == '^') {
				if(isTrue == 'T') {
				ans += lt * rf + lf * rt;
				}
				else {
					ans += lt * rt + rf * lf;
				}
			}
			if(expression.charAt(k) == '|') {
				if(isTrue == 'T') {
				ans += lt * rf + lf * rt + lt * rt;
				}
				else {
					ans +=  rf * lf;
				}
			}
			if(expression.charAt(k) == '&') {
				if(isTrue == 'T') {
				ans += lt * rt;
				}
				else {
					ans += lt * rf + rt * lf + rf * lf;
				}
			}
		}
		return ans;
	}

}
