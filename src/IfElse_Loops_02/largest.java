package IfElse_Loops_02;
import java.sql.SQLOutput;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Three numbers :- ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }


        System.out.println(max);
    }
}
