
import java.util.Scanner;

// for Leet Code 
// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> list = new ArrayList<>();
//         validParentheses(list, new char[n*2],n,0,0,0); 
//         return list;
//     }       
//     public void validParentheses(List<String> list,char[] arr, int n , int i, int o, int c){
//         if( i == arr.length){
//             list.add(new String(arr));
//             return;
//         }
//         if(o<n){
//             arr[i] = '(';
//             validParentheses(list, arr, n, i+1,o+1,c); 
//         }
//         if(c<o){
//             arr[i] = ')';
//             validParentheses(list, arr, n, i+1,o,c+1); 
//         }
//     }
// }
public class GenerateParenthese {

    public static void generateParenthesis(char[] arr, int n, int i, int o, int c) {
        if (i == arr.length) {
            System.out.println(arr);
            return;
        }
        if (o < n) {
            arr[i] = '(';
            generateParenthesis(arr, n, i + 1, o + 1, c);
        }
        if ( c < o) {
            arr[i] = ')';
            generateParenthesis(arr, n, i + 1, o, c + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int n = scan.nextInt();
        char[] arr= new char[n*2];
        generateParenthesis(arr, n, 0, 0, 0);

    }
}
