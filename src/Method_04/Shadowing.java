package Method_04;

public class Shadowing {

    static int x = 20;


    public static void main(String[] args) {
        System.out.println(x);
        int x = 10; // in line 4 x is shadowed here
        System.out.println(x);

        int y = xyz();
        System.out.println(y);

    }
    static int xyz(){
      //  System.out.println(x);
        int temp = x;
        x = 40;
        return x;
    }
}
