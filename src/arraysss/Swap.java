package arraysss;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(4);
//        list.add(4);
//        list.add(7);
//        list.add(5);
//        list.add(6);
        int[] arr = {1,3,5,7,9};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1 ,int index2){
          int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
