package DAY5;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length and breadth");
        double b =in.nextDouble();
        double h =in.nextDouble();
         double area=(b*h)/2 ;
        System.out.println("Area of the triangle" +area);
        in.close();
    }
}
