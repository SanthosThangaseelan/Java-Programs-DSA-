
import java.util.Scanner;

public class NPrime {

    public static void PrimeOneToN(int n) {
        boolean primes[] = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] != true) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N Number to find the Primes : ");
        int n = scan.nextInt();

        PrimeOneToN(n);
    }
}
