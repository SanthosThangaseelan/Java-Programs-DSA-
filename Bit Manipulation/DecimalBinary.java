import java.util.Scanner;

public class DecimalBinary {

    // Converts a decimal number to binary string
    static String decimalToBinary(int n) {
        String b = ""; // To store binary number as a string

        // Repeat until number becomes 0
        while (n >= 1) {
            int x = n % 2;    // Get remainder (0 or 1)
            b = x + b;        // Append it to the front of the binary string
            n /= 2;           // Divide the number by 2
        }
        return b;
    }

    // Converts a binary string to a decimal number
    static int binaryToDecimal(String b) {
        int res = 0;          // Resulting decimal number
        int powOf2 = 1;       // Represents 2^0, 2^1, 2^2, etc.

        // Loop from right to left (least significant bit to most significant bit)
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {   // If the bit is '1'
                res = res + powOf2;     // Add the current power of 2 to result
            }
            powOf2 = powOf2 * 2;        // Move to next power of 2
        }
        return res; // Return the final decimal result
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number to Convert into Decimal to Binary & Binary to Decimal: ");
        int num = scan.nextInt(); // Input decimal number

        // Convert to binary
        String b = decimalToBinary(num);
        System.out.println("Binary : " + b);

        // Convert back to decimal
        System.out.println("Binary to decimal : " + binaryToDecimal(b));
    }
}
