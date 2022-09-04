package algo.dynamicPgming.MCM;

public class PalindromePartition {
	public static void main(String[] args) {
		//divide a String into valid minimum palindromes  
		String name = "nitik"; // ans = 2 i.e n|iti|k  i.e we used 2 partitions to make 3 palindromes in a given string
		String name1 = "limansha"; //
		String name2 = "madam"; // ans = 0 as its a palindrome  
		int n = name.length();
		//return minimum no of partitions requried to partition a string into smaller valid palindromes
		System.out.println(solve(name,0,n));
	}

	private static int solve(String name, int i, int j) {
		if(i > j) {
			return 0;
		}
		System.out.println(name.substring(i,j));
		int min = Integer.MAX_VALUE;
		if(isPalindrome(name,i, j)) {
			System.out.println("palindrome");
			return 0;
		}
		for(int k =i;k<=j-1;k++) {
			int temp = 1 + solve(name,i,k) + solve(name,k+1,j) ;
			if(temp < min) {
				min = temp;
			}
		}
		return min;
	}

	private static boolean isPalindrome(String substring,int i,int j) {
		while(i < j) {
			if(substring.charAt(i) == substring.charAt(j-1)) return true;
			i++;
			j--;
		}
		return false;
	}
}
