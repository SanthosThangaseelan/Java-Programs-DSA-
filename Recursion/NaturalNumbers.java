import java.util.Scanner;
public class NaturalNumbers{
    public static void printNatural(int n){
        if(n==0)
            return;
        printNatural(n-1);
        System.out.print(n+" ");
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Range : ");
        int num = scan.nextInt();
        printNatural(num);
    }
}