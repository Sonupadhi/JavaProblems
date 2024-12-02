package BinarySearch;
// let the static method gives an infinity array.
//search for a given target without using array.length.
public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,8,16,18,28,35,47,49,55,500,540};
        int target = 35;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        //first find the range
        //start with box of 2
        int start = 0;
        int end = 1;
        // double the size of range until target < end.
        while(target > arr[end]){
             int temp = end+1; //new start
             end = end + (end - start + 1) * 2;
             start = temp;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid = start+(end-start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
