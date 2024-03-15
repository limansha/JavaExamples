package algo.BinarySearch;

import java.util.Arrays;

public class MediumBSearchPblms {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,5,5,5,6,6,7};
        int ele = 5;
        int ans [] = findFirstAndLastElePos(arr,ele);
        System.out.println(Arrays.toString(ans));
    }
    public static int[]  findFirstAndLastElePos(int[] arr,int ele){
        int[] ans = new int[2];
        int left = search(arr,ele,true);
        int right = search(arr,ele,false);
        ans[0] = left;
        ans[1] = right;
        return ans;
    }
    public static int search(int[]arr,int ele,boolean isLeft){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == ele) {
                ans = mid;
                if(isLeft){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else if(arr[mid] < ele) start = mid + 1;
            else end = mid - 1;
        }
        return ans; 
    }
}
