package BinarySearch;

public class Ex2 {
    public static void main(String[] args) {

       // int[] arr = {99, 87, 54, 52, 43, 32, -1, -54, -76};
       int[] arr = {-3, -2, -1, 0, 1, 2, 5, 78, 87};
          int ans = search(arr, 5);
        System.out.println(ans);
    }
  static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(target == nums[mid]){
                return mid;
            }

             if(nums[start] < nums[end]) {
                if (target < nums[mid]) {
                end = mid - 1;
              } else{
                start = mid + 1;
            }
        }else{
                if (target > nums[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
