import java.util.Scanner;

public class TrailingZerosInBinary{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int res = (int)(Math.log10(num ^ (num & num-1))/Math.log10(2));
        System.out.println(res);
    }
}