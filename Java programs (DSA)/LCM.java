
import java.util.Scanner;

public class LCM {

    public static int getHCF(int a, int b) {
        if (b == 0) {
            return a; 
        }else {
            return getHCF(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Two Numbers to Find LCM : ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((a*b)/getHCF(a, b));
    }
}
