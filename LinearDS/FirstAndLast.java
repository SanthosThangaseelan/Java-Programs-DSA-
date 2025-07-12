// LeetCode 34

public class FirstAndLast {

    static int[] findFisrtLast(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int res[] = {-1, -1};
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                res[0] = mid;
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length - 1;
        mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                res[1] = mid;
                low = mid + 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {};
        for (int x : findFisrtLast(arr, 0)) {
            System.out.print(x +" ");
        }
    }
}
