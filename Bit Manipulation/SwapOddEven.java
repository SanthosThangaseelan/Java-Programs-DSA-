
import java.util.Scanner;

public class SwapOddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scan.nextInt();
        int res = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);
        System.out.println(res);

    }
}
