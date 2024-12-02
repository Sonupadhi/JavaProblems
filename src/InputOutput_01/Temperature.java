package InputOutput_01;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Temperature in Fahrenheit :- ");
//        double f = sc.nextDouble();
//        double c = (f - 32)*5/9;
//        System.out.println("Temperature in celsius is :- " + c);


        System.out.print("Enter 0 to convert in celsius & 1 for fahrenheit :- ");
        int a = sc.nextInt();
        if (a==0){
              System.out.print("Enter Temperature in Fahrenheit :- ");
               double f = sc.nextDouble();
               double c = (f - 32)*5/9;
               System.out.println("Temperature in celsius is :- " + c);
        }else if(a==1){
            System.out.print("Enter Temperature in Celsius :- ");
            double cel = sc.nextDouble();
            double fer = (cel * 5/9)+ 32;
            System.out.println("Temperature in Fahrenheit is :- " + fer);
        }else{
            System.out.println("Enter a valid input 0 or 1");

        }


    }
}
