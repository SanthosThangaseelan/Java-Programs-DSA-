
import java.util.Scanner;

public class SumOfList{

    public static int sumOfArray(int[] arr, int index){
        if(index == arr.length)
            return  0;
        return arr[index] + sumOfArray(arr, (index+1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int num = scan.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(sumOfArray(arr, 0));
    }
}