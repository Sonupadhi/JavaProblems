package IfElse_Loops_02;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 74553;

        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == 5){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
