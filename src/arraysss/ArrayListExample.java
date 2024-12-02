package arraysss;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(4);

//        list.add(12);
//        list.add(142);
//        list.add(123);
//        list.add(45);
//        list.add(453);
//        list.add(54);
//        list.set(1,55);
//        System.out.println(list);
//        System.out.println(list.contains(55));

        for(int i = 0;i<4;i++){
            list.add(sc.nextInt());
        }

        for(int i = 0;i<4;i++){
            System.out.println(list.get(i));
        }
//        list.add(12);
//        list.add(142);
//       list.add(123);
//        list.add(45);
        System.out.println(list);
    }
}
