package arraysss;

import java.util.Arrays;

public class VariableColumnInArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 13, 14 },
                { 15, 16 },
                { 18, 19, 10, 20}
        };

        for(int row=0; row < arr.length; row++){
            for(int col=0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " " );
            }
           System.out.println();
        }
    }
}
