
import java.util.Scanner;

public class Repeat{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        char ch = ' ';
        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            if(name.indexOf(c) == name.lastIndexOf(c)){
                System.out.println("res : "+name.charAt(i)+" ; "+c);
                break;
            }
        }
     }
}