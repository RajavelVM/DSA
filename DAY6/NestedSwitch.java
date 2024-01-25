package DAY6;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your empid and department");
        int empid = in.nextInt();
        String department=in.next();

        switch(empid){
            case 1:
            System.out.println("Hi Rajavel");
            break;
            case 2 :
            System.out.println("Hi Vijay");
            break;
            case 3:
             switch (department) {
                case "MCE":
                    System.out.println("Greetings from MCE Department");
                    break;
                case "IT":
                    System.out.println("IT department");
                    break;
             
                default:
                System.out.println("Other departments not allowed");
                    break;
             }
            default:
            System.out.println("Enter a valid id");
            break;     
        }
        in.close();
    }
}
