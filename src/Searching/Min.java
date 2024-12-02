package Searching;

public class Min {
    public static void main(String[] args) {
        int[] arr = {99, -1, 87, -3, 5};
        System.out.println(min(arr));
    }
    static int min(int[] nums){
        int min = nums[0];
        for(int index=1; index< nums.length; index++){
            int k = nums[index];
            if(k < min){
                min = k;
            }

        }
        return min;
    }
}
