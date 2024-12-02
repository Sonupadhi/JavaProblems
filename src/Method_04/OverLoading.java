package Method_04;

public class OverLoading {
    public static void main(String[] args) {
        /* Two thing to be kept in mind
        * 1. either the pass data type should be different
        * 2. or the no of arguments should be different if it is of same datatype
        * */
        fun(5);
        fun("hello");

        int sum = fun(4,1,5);
        System.out.println(sum);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static int fun(int a, int b, int c){
        return a + b + c;


    }
}
