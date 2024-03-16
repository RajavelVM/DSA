package DAY12;

 
    import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    int count=0,q,r;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int n1=n;
    int sqr=n1*n1;
    
    while(n1>0){
      n1=n1/10;
      count++;
      
  }
    q=sqr%(int) Math.pow(10,count);
    r=sqr/(int) Math.pow(10,count);
    
    if(q+r==n){
      System.out.print("Kaprekar Number");
    }else{
      System.out.print("Not a Kaprekar Number");
    
}
  }
}

