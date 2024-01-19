package DAY3;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        System.out.println("Enter a Variable");
        Scanner in =new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        in.close();
        if (ch>='a' && ch<='z') {
            System.out.println("lowercase");
        }else{
            System.out.println("Uppercase");
        }

        
    }
}
