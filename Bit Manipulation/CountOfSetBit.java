
import java.util.Scanner;

public class CountOfSetBit {
    public static int countSetBit(int num){
        int count = 0;
        while(num >0){
            num = (num & (num-1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(countSetBit(num));
    }
}
