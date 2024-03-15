package algo.BinarySearch;

public class SimpleSearch {
    //when ever the given input is in sorted array then we nedd to try solving it using Binary Search
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7};
        int ele = 7;
        int idx = search(arr,ele);
        if(idx != -1) System.out.println("found at index : "+idx);
        else System.out.println("not found");

        //find ceil of number means the number just greater than the ele given
        int ceilNum = 4;
        int ceil = ceilNumber(arr,ceilNum);
        System.out.println("ceil of "+ceilNum + " is " + arr[ceil]);
        
        //find floor of number means the number just smaller(largest smallest num than ele) than the ele given
        int floorNum = 4;
        int floor = floorNumber(arr,floorNum);
        System.out.println("floor of "+floorNum + " is " + arr[floor]);
        
    }
    public static int floorNumber(int[]arr,int ele){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == ele) return mid;
            else if(arr[mid] < ele) start = mid + 1;
            else end = mid - 1;
        }
        //as the loop breaks when start cross end so the floor of ele would be pointed by end
        return end;
    }

    public static int ceilNumber(int[]arr,int ele){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == ele) return mid;
            else if(arr[mid] < ele) start = mid + 1;
            else end = mid - 1;
        }
        //as the loop breaks when start cross end and this happens at the close proxy of ele searched
        return start;
    }

    public static int search(int[]arr,int ele){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == ele) return mid;
            else if(arr[mid] < ele) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
