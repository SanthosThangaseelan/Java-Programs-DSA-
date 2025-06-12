
import java.util.Scanner;

public class AllTheDivisorOfNum{
    public static void findDivisor(int n){
        int i=0;
        for(i=1;i*i<=n;i++){
            if(n%i == 0)
                System.out.println(i);
        }
        for( ; i>=1; i--){
            if(n%i == 0 && i !=n/i )
                System.out.println(n/i);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The N Numer : ");
        int n = scan.nextInt(); 
        findDivisor(n);
    }
}