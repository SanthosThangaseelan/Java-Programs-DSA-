
import java.util.Scanner;

public class  ConsecutiveOnes{
    static int countOnes(int num){
        int count=0;
        if(num  == 0)
            return 0;
        while(num > 0){
            num = ( num & (num << 1) );
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find the consecutive ones in binary representation : ");
        int num = scan.nextInt();
        System.out.println(countOnes(num));
    }
}