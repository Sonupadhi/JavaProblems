package IfElse_Loops_02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("Enter the operator : - ");
            // Input operator
            char operator = in.next().trim().charAt(0);
            System.out.println();
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter two numbers: - ");
                // Input two numbers
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if (operator == '+') { // addition
                    ans = num1 + num2;
                }
                if (operator == '-') { // subtraction
                    ans = num1 - num2;
                }
                if (operator == '*') { // multiplication
                    ans = num1 * num2;
                }
                if (operator == '/') {// division
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }

                }
                if (operator == '%') { // reminder
                    ans = num1 % num2;
                }
            }
                else if(operator == 'x' || operator == 'X'){ // exit from loop
                    break;
                }
                else{
                    System.out.println("Not a valid operator."); // invalid input
                }
            System.out.println(ans);



        }
    }
}
