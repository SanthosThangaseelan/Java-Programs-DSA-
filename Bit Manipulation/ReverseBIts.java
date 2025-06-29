
import java.util.Scanner;

public class ReverseBIts {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ....");
        int num = scan.nextInt();

        int rev = 0;
        int f = 31;
        int l = 0;

        while (f > l) {
            if ((num & (1 << f)) != 0) {
                rev = rev | (1 << l);
            }
            if ((num & (1 << l)) != 0) {
                rev = rev | (1 << f);
            }
            f--;
            l++;
        }
        System.out.println("After Reversing the bits : "+rev);
    }
}
