package algo.dynamicPgming.MCM;

import java.util.Arrays;

public class MatrixChainMultiplication {
	static int arr[] = new int []{40,10,30,5,2,20,30};
	static int n = arr.length-1;
	static int[][] t = new int[n+1][n+1];
	public static void main(String[] args) {
	
		//Two schemes basically to place the paranthesis between matrixes
//if K is the point where we divide the problem then we have only two valid traversing schemes
		//i should Start from i =1 and j should end at length of array n
		//first : for loop if its from  k = i to k = j-1 then division/function call is from i to k and k+1 to j;
		//second k = i+1 to k = j then division is from i to k-1 and k to j
		int minCost = solve(arr,1,n);
		System.out.println("The minimum cost incurred to multiply the above "+n +" matrixes are "+minCost);
		for(int []r :t) Arrays.fill(r, -1);
		System.out.println(solveMemorizatn(arr,1,n));
		for(int []r :t) System.out.println(Arrays.toString(r));
	}

	private static int solve(int[] arr, int i, int j) {
		if(i >= j) {//base condition
			return 0;
		}
		int minValue = Integer.MAX_VALUE;
		for(int k =i;k<=j-1;k++) {
			
			int temp = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1] * arr[k]*arr[j]);
			if(temp < minValue) minValue = temp;
		}
		return minValue;
	}
	private static int solveMemorizatn(int[] arr, int i, int j) {
		
		if(i >= j) {//base condition
			return 0;
		}
		if(t[i][j] != -1) {
			System.out.println("picking memorised value");
			return t[i][j];
		}
		
		int minValue = Integer.MAX_VALUE;
		for(int k =i;k<=j-1;k++) {
//			t[i][k] = solve(arr,i,k);
//			t[k+1][j] = solve(arr,k+1,j);
//			t[i][j] = t[i][k] + t[k+1][j] + (arr[i-1] * arr[k]*arr[j]);
			int temp = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1] * arr[k]*arr[j]);
			if(temp < minValue) {
				minValue = temp;
			}
//			if(t[i][j] < minValue) {
//				minValue = t[i][j];
//			}
		}
		return t[i][j] = minValue;
	}
}

