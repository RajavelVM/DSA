package DAY12;

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        int n,r,sum=0;
        Scanner in =new Scanner (System.in);
        n=in.nextInt();
        
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r;
            
            if(n==0 && sum>10){
                n=sum;
                sum=0;
            }
        }
        System.out.print(sum);
    }
}