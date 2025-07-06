
import java.util.Scanner;

public class Palindrome{

    public static boolean isPalindrome(String str, int i, int j){
        if(str.charAt(i) != str.charAt(j))
            return false;
        if(i>=j){
            return true;
        }
        return isPalindrome(str, i+1, j-1);
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the String to check Palindrome....");
        String str = scan.next();
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}