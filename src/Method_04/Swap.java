package Method_04;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b= 20;

        swap(a , b);
       System.out.println(a+ " "+b);
        /*it will not swap the values bcz reference variable
        is not passed in the method, only the object to the
         reference is passed(the value of the reference variable is passed)
    and the values are swapped internally  but not return outside it.
        */

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;



    }
}
