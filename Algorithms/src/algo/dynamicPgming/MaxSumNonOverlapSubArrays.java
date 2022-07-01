package algo.dynamicPgming;

import java.util.Arrays;

/*
 * Maximum Sum Of Two Non Overlapping Subarrays | Dynamic Programming
 * where the length of two subArray is given as firstLen and secondLen
 * to Maximum sum of subarray - Kadene's algorithm  in algo.common.KadenesAlgo
 */
public class MaxSumNonOverlapSubArrays {

	public static void main(String[] args) {
		int []arr1 = {3,8,1,3,2,1,8,9,0}; //solution only for positive numbers
		int []arr= {0,6,5,2,2,5,1,9,4};
		int N = arr.length;
		int []rightArr= new int[N];
		int []leftArr= new int[N];
		int firstLen = 1;
		int secondLen = 2;
		int leftMax =0;
		int rightMax =0;
		/*for(int i=firstLen-1;i<N;i++) {
			int sum =0;
			for(int j=0;j<firstLen;j++) {
				sum += arr[i-j];
			}
			if(sum > leftMax) leftMax = sum;
			leftArr[i] = leftMax; //max of leftsubArrLen sized subarray from 0th index to ith index
		}
		System.out.println(leftMax);
		System.out.println(Arrays.toString(leftArr));
		for(int i=N-secondLen;i>=0;i--) {
			int sum =0;
			for(int j=0;j<secondLen;j++) {
				sum += arr[i+j];
			}
			if(sum > rightMax) rightMax = sum;
			rightArr[i] = rightMax; //max of rightsubArrLen sized subarray from ith index to last index
		}
		System.out.println(rightMax);
		System.out.println(Arrays.toString(rightArr));
		int maxNonOverlap =0;
		int leftidx =0;
		int rightidx = 0;
		for(int i = firstLen-1;i<N-secondLen;i++) {
			int leftSum = leftArr[i]; //max sum from 0 to i;
			int rightSum = rightArr[i+1]; //max sum from i+1 to N
			int sum = leftSum + rightSum;
			if(sum > maxNonOverlap) 
				{
				maxNonOverlap = sum;
				leftidx = i;
				rightidx = i+1;
				}
		}

		System.out.println("left array from 0 to "+leftidx);
		System.out.println("right array from "+rightidx +" to "+(N-1));
		System.out.println("final result "+maxNonOverlap);*/
		for(int i=firstLen-1;i<N;i++) {
			int sum =0;
			for(int j=0;j<firstLen;j++) {
				sum += arr[i-j];
			}
			if(sum > leftMax) leftMax = sum;
			leftArr[i] = leftMax; //max of leftsubArrLen sized subarray from 0th index to ith index
		}
		//System.out.println(leftMax);
		//System.out.println(Arrays.toString(leftArr));
		for(int i=N-secondLen;i>=0;i--) {
			int sum =0;
			for(int j=0;j<secondLen;j++) {
				sum += arr[i+j];
			}
			if(sum > rightMax) rightMax = sum;
			rightArr[i] = rightMax; //max of rightsubArrLen sized subarray from ith index to last index
		}
		//System.out.println(rightMax);
		//System.out.println(Arrays.toString(rightArr));
		int maxNonOverlap =0;
		for(int i = firstLen-1;i<N-secondLen;i++) {
			int leftSum = leftArr[i]; //max sum from 0 to i;
			int rightSum = rightArr[i+1]; //max sum from i+1 to N
			int sum = leftSum + rightSum;
			if(sum > maxNonOverlap) 
				{
				maxNonOverlap = sum;
				}
		}
        
        leftMax =0;
		rightMax =0;
		
        for(int i=secondLen-1;i<N;i++) {
			int sum =0;
			for(int j=0;j<secondLen;j++) {
				sum += arr[i-j];
			}
			if(sum > leftMax) leftMax = sum;
			leftArr[i] = leftMax; //max of leftsubArrLen sized subarray from 0th index to ith index
		}
		//System.out.println(leftMax);
		//System.out.println(Arrays.toString(leftArr));
		for(int i=N-firstLen;i>=0;i--) {
			int sum =0;
			for(int j=0;j<firstLen;j++) {
				sum += arr[i+j];
			}
			if(sum > rightMax) rightMax = sum;
			rightArr[i] = rightMax; //max of rightsubArrLen sized subarray from ith index to last index
		}
		//System.out.println(rightMax);
		//System.out.println(Arrays.toString(rightArr));
		for(int i = secondLen-1;i<N-firstLen;i++) {
			int leftSum = leftArr[i]; //max sum from 0 to i;
			int rightSum = rightArr[i+1]; //max sum from i+1 to N
			int sum = leftSum + rightSum;
			if(sum > maxNonOverlap) 
				{
				maxNonOverlap = sum;
				}
		}
		System.out.println("final result "+maxNonOverlap);
	}

}
