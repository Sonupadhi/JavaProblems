package Switch_03;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fr = sc.nextLine();

        switch(fr){
//            case "Mango":
//                System.out.println("King of friuts.");
//                break;
//            case "Orange":
//                System.out.println("Orange color");
//                break;
//            case "Banana":
//                System.out.println("Banananana");
//                break;
//            default:
//                System.out.println("Not in database");

            case "Mango" , "mango" -> System.out.println("king of fruit");
            case "Orange" -> System.out.println("orange in color");
            case "Banana" -> System.out.println("Banananana");
            default -> System.out.println("not a valid fruit");

        }
    }
}
