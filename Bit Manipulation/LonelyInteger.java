
import java.util.Scanner;

public class LonelyInteger {

    public static int findInteger(int[] num) {
        int result = 0;
        for (int i : num) {
            result = result ^ i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[7];
        System.out.println("Enter the array with one unique value reat as pair");
        for (int i = 0; i < 7; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println(findInteger(num));
    }
}
