package BinarySearch;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {-3, -2, -1, 0, 1, 2, 5,3, 78 ,87};
        int ans = search(arr,3);
        System.out.println(ans);

    }
    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
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
        return start;
    }
}

