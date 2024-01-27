package DAY7;

public class Armstrong {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            if (isarmstrong(i)) {
                System.out.print(i + " " );
                
            }
        }
        
    }
    static boolean isarmstrong(int n){
        int original =n;
        int sum=0;

        while (n>0) {
            int rem=n%10;
            sum+=rem*rem*rem;
            n/=10;
            
        }
        return (original==sum);
    }

    
}
