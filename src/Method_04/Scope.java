package Method_04;

public class Scope {
    public static void main(String[] args) {
        int a =10;

        {
           a = 2;
            int b=5;
        }

        // a = 6;
        int b=6;
        System.out.println(a);
    }
}
