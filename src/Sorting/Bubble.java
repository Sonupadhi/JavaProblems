package Sorting;
import  java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 67, 22};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void BubbleSort(int[] nums){
        boolean swapped;
        for(int i = 0; i < nums.length; i++){
            swapped = false;
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j] < nums[j-1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false ){
                break;
            }
        }
    }
}
