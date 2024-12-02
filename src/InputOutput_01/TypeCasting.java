package InputOutput_01;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   // float num = sc.nextFloat();
  //  int num2 = sc.nextInt();
      //  System.out.println(num);
        //System.out.println(num2);

        //Type Casting
        //   int num1 = (int)(33.45f);
//          //  System.out.println(num1);

        // automatic type promotion in expression
     //int a = 258;
    // byte b = (byte)(a);  // 268 % 256 = 2
//        System.out.println(b);

//        byte c = 40;
//        byte d = 50;
//        byte e = 100;
//
//        int f = c * d / e;
//        byte g = (byte)(f);
        //System.out.println(g);
        // while calculating intermediate exp a * b the result stored in int
        //automatically

         byte b = 43;
         char c = 'g';
         short s = 3453;
         int i = 453;
         double d = 3434.3443;
         float f = 34.43f;
         double result = (f*b)+(i / c)-(d*s);

        System.out.println((f*b)+" "+(i / c)+" "+(d*s));
        System.out.println(result);
        //double = float + int - double
        // as datatype of double has large capacity any datatype can be converted into double

    }
}
