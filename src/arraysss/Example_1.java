package arraysss;
import java.util.Arrays;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int[] array = new int[5];
//        arr[0] = 7;
//        arr[1] = 1;
//        arr[2] = 2;
//        arr[3] = 3;
//        arr[4] = 4;
//
//        for(int i = 0;i<= arr.length;i++){
//            System.out.print(arr[i]);
//        }

//        int n;
//        int[] array = new int[n];
//        System.out.println("Enter the length of array");
//        n = sc.nextInt();
//        System.out.println("Enter the values of array");


        for (int i = 0; i < array.length - 1; i++) {

            array[i] = sc.nextInt();

        }

        System.out.println(Arrays.toString(array));
//        for (int k : array) {
//            // j represents the elements of array
//
//            System.out.print(k + " ");
//        }

        //Best way to print an array

    }
}
