import java.util.Scanner;
public class CountOfDigit{
    public static int CountOfDigit(int n){
        if(n == 0)
            return 0;
        return CountOfDigit( n/10 ) + 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scan.nextInt();
        System.out.println(CountOfDigit(number));
    }
}