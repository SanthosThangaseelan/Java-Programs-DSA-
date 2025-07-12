import java.util.Scanner;
public class PhoneKeypad{
    static String keypad[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void possibleWords(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        String key = keypad[str.charAt(0) - 48 ];

        for(int i=0;i<key.length();i++){
            possibleWords(str.substring(1), ans + key.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        String str = scan.next();
        possibleWords(str, "");
    }
}