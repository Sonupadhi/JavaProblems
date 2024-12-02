package Method_04;
import java.util.Arrays;
import java.lang.reflect.Array;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {3,6,4,77,90};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99;

    }
}
