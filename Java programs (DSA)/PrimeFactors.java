
import java.util.Scanner;

public class PrimeFactors{
    public static void findPrimeFactors(int n){
        int i=2; // 1 is neither prime nor a composite
        while(i*i <= n){ // if it is non-prime the first factor will occur before it's root (sqrt(n))
            while(n%i == 0){
                System.out.print(i + " ");
                n/=i;
            } 
            i++;
        } 
        if(n>1)
            System.out.println(n); // if the number is prime its factor is 1 and itself so the 1st loop checks the condition 

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to Find It's Prime factors : "); // 900 ===> 2*2*3*3*5*5
        int n = scan.nextInt();
        findPrimeFactors(n);

    }
}