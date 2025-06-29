import java.util.Scanner;

public class FindRightMostSetBit {

    // This method finds the position of the rightmost set bit (1) in the binary representation of num
    public static int findRMSB(int num) {
        // Step 1: (num & -num) gives a number with only the rightmost set bit
        // Step 2: (num ^ (num & (num - 1))) also isolates the rightmost set bit
        // Step 3: log base 2 of that gives the position (0-based), so we add 1 for 1-based indexing

        // Example: num = 20 (10100)
        // num & (num - 1) = 10100 & 10011 = 10000
        // num ^ (num & (num - 1)) = 10100 ^ 10000 = 00100 → Rightmost set bit isolated
        // in java we don't have log base 2 for formula is => log base 2 (N) = log10(N) / log10(2)
        

        return (int)(Math.log10(num ^ (num & (num - 1))) / Math.log10(2)) + 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        // Output the position of the rightmost set bit
        System.out.println("Position of Rightmost Set Bit: " + findRMSB(num));
    }
}
