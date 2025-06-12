
import java.util.Scanner;

public class Prime{
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        if(n==2 || n == 2)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5;i*i<=n;i++){ //i*i => i <= root(n)  ==> add square bith sides ==> i^2 <= n 
            if(n%i==0)
                return false;
        }
        return true;
    } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to Find Factorial : ");
        int n = scan.nextInt();

        System.out.println(isPrime(n));

    }
}