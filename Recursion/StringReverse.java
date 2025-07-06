
import java.util.Scanner;

public class StringReverse{

    public static String reverseString(String str, String revStr, int len){
        if(len < 0)
            return revStr;
        return reverseString(str, revStr+str.charAt(len), len - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the STring to reverse ...  ");
        String str = scan.next();
        System.out.println(reverseString(str, "", str.length()-1));
    }
}