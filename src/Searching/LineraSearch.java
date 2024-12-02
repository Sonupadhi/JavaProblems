package Searching;

public class LineraSearch {
    public static void main(String[] args) {
        int[] arr = {3, 55 ,23, 65 ,96 ,69, -23, -43, -1, 0, 99};
        int ans = LinearSearch(arr, 69);
        System.out.println(ans);
    }

    static  int LinearSearch(int[] nums , int key){

        if(nums.length == 0){
            return -1;
        }

        for(int index = 0; index<nums.length; index++){
            if(nums[index] == key){
                return index;
            }
        }
        //if element not fount in the array
        return -1;

    }

}
