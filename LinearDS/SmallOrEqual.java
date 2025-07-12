
public class SmallOrEqual {

    static int findCount(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                while ((mid + 1) < arr.length && arr[mid + 1] == key) {
                    mid++;
                }
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (arr[mid] > key) {
            return mid - 1;
        } else {
            return mid + 1;
        }
    }

    public static void main(String[] args) {
        //  int arr[] = {2,4,5,6,14,25,26,28,29};
        //  int arr[] = {2,4,5,6,14,25,26,26,26};
          int arr[] = {2,4,5,6,14,25,27,28,29};
        System.out.println(findCount(arr, 26));
    }
}
