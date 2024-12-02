package Method_04;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {


  //  int ans = sum2();
     //   System.out.println(ans);

       // sum();
        int ans = sum3(30,40);  // pass by values
        System.out.println(ans);

    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int add = num1 + num2;
        return add;

     //   System.out.println("ans");


    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
       int sum = num1 + num2;
      System.out.println(sum);
    }

    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }
}
