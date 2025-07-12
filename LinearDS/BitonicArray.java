
public class BitonicArray {

    static int ascendingSearch(int[] arr, int target, int range) {
        int low = 0;
        int high = range;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int descendingSearch(int[] arr, int target, int range) {
        int low = range;
        int high = arr.length;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int findBitonicIndex(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return -1;
    }

    static int searchbitonic(int arr[], int target, int bindex) {
        if (target == arr[bindex]) {
            return bindex;
        }
        if (target > arr[bindex]) {
            return -1;
        }
        int res1 = ascendingSearch(arr, target, bindex);
        if (res1 != -1) {
            return res1;
        }
        int res2 = descendingSearch(arr, target, bindex);
        if (res2 != -1) {
            return res2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 9, 10, 3, 2, 1};
        int bindex = findBitonicIndex(arr);
        System.out.println(searchbitonic(arr, 10, bindex));
    }
}
