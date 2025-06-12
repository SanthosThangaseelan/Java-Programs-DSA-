
import java.util.Scanner;

public class HCF{
    public static int getHCF(int a, int b){
        if(b==0)
            return a;
        else
            return getHCF(b, a%b);

        /*
            while(a != 0 && b != 0)
            {
                if(a>b)
                    a = a%b;
                else
                    b = b%a;
            }
            if(a != 0)
                return b
            else
                return a
        */
    } 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number to find the HCF : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(getHCF(a, b));
    }
}