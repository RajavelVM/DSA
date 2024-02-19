package DAY11;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         if (isarmstrong(n)) {
            System.out.println("Armstrong");
         }
         else 
         {
             System.out.println("Not an armstrong");
         }
        
    }

    static boolean isarmstrong(int n){
        int original=n;
        int sum=0;

        while (n>0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        return(original==sum);
    }
}
