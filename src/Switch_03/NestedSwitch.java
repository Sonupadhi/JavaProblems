package Switch_03;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpID = sc.nextInt();
        String department = sc.next();

        switch(EmpID){
            case 1:  System.out.println("sonu");
                break;
            case 2:
                System.out.println("biswa");
                break;
            case 3:
                System.out.println("emp no. 3");
                switch (department){
                    case "IT":
                        System.out.println(" IT dept");
                        break;
                    case "HR":
                        System.out.println("HR department");
                        break;
                    default:
                        System.out.println("not  a valid dept");
                }
                break;
            default:
                System.out.println("not a valid EmpID");
        }
    }
}
