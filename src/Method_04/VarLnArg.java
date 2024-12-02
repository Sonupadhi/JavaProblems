package Method_04;

import java.util.Arrays;

public class VarLnArg {// variable length arguments

    public static void main(String[] args) {
        fun(33,2,3,5,8,24,7557,86,56);
        funn("hello","every","one");
        multiple(2,5,6,7,3);

    }

    static void fun(int...v){ // the length of array will depend on the no. of element passed
        System.out.println(Arrays.toString(v));
    }

    static void funn(String...g){
        System.out.println(Arrays.toString(g));

    }

    static void multiple(int a, int b,int ...v){
        System.out.print(a);
        System.out.print(b);
        System.out.print(Arrays.toString(v));
    }

}
