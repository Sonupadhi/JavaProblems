package InputOutput_01;

import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("sum of two numbers are: "+sum);
    }
}
