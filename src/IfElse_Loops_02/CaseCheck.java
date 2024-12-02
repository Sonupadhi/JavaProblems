package IfElse_Loops_02;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "hello";
      char ch = sc.next().trim().charAt(0);
        System.out.println(ch);
        if( ch >= 'a' && ch <= 'z'){
            System.out.println("it's a lowercase");
        }else{
            System.out.println("it's a uppercase");
        }


    }
}
