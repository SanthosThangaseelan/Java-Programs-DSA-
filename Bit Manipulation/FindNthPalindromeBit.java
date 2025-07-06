
import java.util.Scanner;

public class FindNthPalindromeBit {

    public static int reverseBit(int num, int len) {
        int rev = 0;
        int f = len-1;
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
        return rev;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value to find The Palindrome of a Binary representation : ");
        int num = scan.nextInt();
        int len = 0, count = 0;
        while (count < num) {
            len++;
            count = count + (int) Math.pow(2, (len - 1) / 2);
        }
        count = count - (int) Math.pow(2, (len - 1) / 2);
        int element = num - count - 1;
        int answer = (1 << len - 1) | (element << len / 2);
        answer = answer | reverseBit(answer, len);
        System.out.println(Integer.toBinaryString(answer));



    }
}
