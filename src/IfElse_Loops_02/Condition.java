package IfElse_Loops_02;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = 22500;
        if (salary > 20000){
            salary = salary + 2000;
        }else{
            salary = salary+1000;
        }
        System.out.println(salary);

    }
}
