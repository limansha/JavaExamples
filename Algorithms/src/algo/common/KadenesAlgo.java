package algo.common;
/*
 * used to find maximum subArray in o(N) time.
 */
public class KadenesAlgo {

	public int bruteForceApproach(int []arr){
		//takes O(N^3)
		  int N = arr.length;
			int max = Integer.MIN_VALUE;
			for(int i=0;i<N;i++) {
				for(int j=i;j<N;j++) {
	                int sum = 0;
					for(int k =i;k<=j;k++) {
						sum += arr[k];
					}
	              max = Math.max(sum, max);
				}
			}
			return max;

	}
	public int bruteForceApproach1(int []arr){
		//takes O(N^2)
		  int N = arr.length;
			int max = Integer.MIN_VALUE;
			for(int i=0;i<N;i++) {
				int sum = 0;
				for(int j=i;j<N;j++) {
	                sum += arr[j];
				max = Math.max(sum, max);
				}
			}
			return max;
	}
	public int kadensAlgorithm(int []arr) {
        int sum =0;
        int N = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<N;i++) {
			sum +=arr[i];
			if(sum > max) max  = sum;
			if(sum < 0) sum =0; 
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {-2,-3,4,-1,-2,1,5,-3};
		KadenesAlgo ka = new KadenesAlgo();
		System.out.println(ka.bruteForceApproach(arr));
		System.out.println(ka.bruteForceApproach1(arr));
		System.out.println(ka.kadensAlgorithm(arr));
	}

}
