
import java.util.Scanner;
public class TailingZerosFactorial{
    public static int FindZeros(int n){
        int powOfN = 5;
        int res= 0;
        if(n < 5){
            return 0;
        }
        while(n>=powOfN){
            res+=n/powOfN;
            powOfN*=5;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Factorial Number : ");
        int N = scan.nextInt();
        System.out.println(FindZeros(N));
    }
}