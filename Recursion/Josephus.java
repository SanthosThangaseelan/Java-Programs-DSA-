// class Solution {
//     public int findTheWinner(int n, int k) {
//         if (n == 1)
//             return 1;
//         return (findTheWinner(n - 1, k) + k - 1) % n + 1;
//     }
// }

import java.util.Scanner;
public class Josephus {
    public static  int lastPerson(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (lastPerson(n -1, k) + k) % n;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number Of People : ");
        int n = scan.nextInt();
        System.out.println("Enter the Killing Factor : ");
        int k = scan.nextInt();
        System.out.println("the person in the "+(lastPerson(n, k) + 1)+"th place is the Winner");
    }
}
