
public class CountSubset {

    static int countSubset(int[] arr, int sum, int i) {
        if (sum == 0) {
            return 1;
        }
        if (sum < 0) {
            return 0;

        }
        if (i == arr.length) {
            return 0;
        }
        return countSubset(arr, sum - arr[i], i + 1) + countSubset(arr, sum, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 5};
        System.out.println(countSubset(arr, 25, 0));
    }
}
