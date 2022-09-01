package algo.dynamicPgming.MCM;

public class PalindromePartition {
	public static void main(String[] args) {
		//divide a String into valid minimum palindromes  
		String name = "nitik"; // ans = 2 i.e n|iti|k  i.e we used 2 partitions to make 3 palindromes in a given string
		String name1 = "limansha"; //
		String name2 = "madam"; // ans = 0 as its a palindrome  
		int n = name.length();
		//return minimum no of partitions requried to partition a string into smaller valid palindromes
		solve(name,1,n-1);
	}

	private static void solve(String name, int i, int j) {
	
	}
}
