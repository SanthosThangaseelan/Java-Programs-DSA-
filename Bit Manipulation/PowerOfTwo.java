import java.util.Scanner;
public class PowerOfTwo {
    public static boolean  isPOWofTwo(int num){
        if(num == 0)
            return false;
        return ( num & (num-1)) == 0 ;
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPOWofTwo(num));
    }
}