package arraysss;
import java.util.Arrays;

public class PassInFunction {
    public static void main(String[] args) {
        int[] arr = {23,44,2,23};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[3] = 99;
    }
}
