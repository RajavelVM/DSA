package DAY6;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the fruit name");
    String fruit = in.next();
    

    switch (fruit) {
        case "mango":
        System.out.println("Yellow fruit");
            break;
        case "apple":
        System.out.println("red fruit");
            break;
        case "orange":
        System.out.println("orange fruit");
            break;
        default:
            break;
    }
    in.close();
    }
    
  
}
