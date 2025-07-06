import java.util.Scanner;
public class Subsequence{
    public static void gss(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        gss(str.substring(1), ans + str.charAt(0));
        gss(str.substring(1), ans);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        gss(str, "");
    }

}