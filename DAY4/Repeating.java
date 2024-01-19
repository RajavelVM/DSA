package DAY4;

public class Repeating {
    public static void main(String[] args) {
        int n=95666667;
        int count =0;
        

        while (n>0) {
            int rem=n%10;
            if (rem==6) {
                count++;
                
            }
            n=n/10;
        } 
        System.out.println(count);

            
        

    }
}
