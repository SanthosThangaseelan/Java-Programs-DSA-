
import java.util.Scanner;

public class LuckyNumber {

    static boolean isLucky(int num, int counter) {
        if (num % counter == 0) {
            return false;
        }
        if (num < counter) {
            return true;
        }
        num = num - (num / counter);
        return isLucky(num, counter + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check is a lucky Number or Not ...");
        int num = scan.nextInt();
        if (isLucky(num, 2)) {
            System.out.println(num + " is a Lucky Number."); 
        }else {
            System.out.println(num + " is NOT a Lucky Number.");
        }
    }
}
