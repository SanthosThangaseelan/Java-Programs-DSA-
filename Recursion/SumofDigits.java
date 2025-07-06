import java.util.Scanner;
public class SumofDigits{
    public static int sumOfDigit(int n){
        if(n == 0)
            return 0;
        return sumOfDigit( n/10 ) + (n%10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scan.nextInt();
        System.out.println(sumOfDigit(number));
    }
}