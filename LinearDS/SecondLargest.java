
public class SecondLargest {

    public static int secondLargest(int a[]) {
        int max1 = 0;
        int max2 = 0;
        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }
        for (int i = 2; i < a.length; i++ ){
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i] > max2){
                max2 = a[i];
            }
        }
        return max2;
    }

        public static int secondSmallest(int a[]) {
        int min1 = 0;
        int min2 = 0;
        if (a[0] < a[1]) {
            min1 = a[0];
            min2 = a[1];
        } else {
            min1 = a[1];
            min2 = a[0];
        }
        for (int i = 2; i < a.length; i++ ){
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            }
            else if(a[i] < min2){
                min2 = a[i];
            }
        }
        return min2;
    }
    public static void main(String args[]) {
        int a[] = {14,81,13,18,76,45,1};
        System.out.println(secondLargest(a));
        System.out.println(secondSmallest(a));
    }
}
