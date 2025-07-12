
public class CeilAndFloor {

    public static int ceil(int arr[], int target) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return arr[mid]; 
            }else if (target > arr[mid]) {
                low = mid + 1; 
            }else {
                high = mid - 1;
            }
        }
        if (low < arr.length) {
            return arr[low]; 
        }else {
            return -1;
        }
    }

    public static int floor(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return arr[mid]; 
            }else if (target > arr[mid]) {
                low = mid + 1; 
            }else {
                high = mid - 1;
            }
        }
        if (high>=0) {
            return arr[high]; 
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {19,23,45,62,72,88,92};
        System.out.println(ceil(arr, 98));
        System.out.println(floor(arr, 18));
    }
}
