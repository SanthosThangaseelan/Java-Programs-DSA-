
import java.util.Scanner;

public class MaxAnd {

    public static int getCount(int arr[], int mask) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((mask & arr[i]) == mask) {
                count++;
            }
        }
        return count;
    }

    public static int getMaxValue(int arr[]){
        int res =0;
        int mask =0;

        for(int i=31 ; i>=0 ; i--){
            mask = 1<<i | res;
            int count = getCount(arr, mask);
            if(count>=2){
                res = res | mask ;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {16, 9, 6, 13};

        System.out.println(getMaxValue(arr));

    }
}
