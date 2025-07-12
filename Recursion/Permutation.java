import java.util.Scanner;
public class Permutation{
    public static void permutation(char arr[], int fi){
        if(fi == arr.length - 1 ){
            System.out.println(arr);
            return;
        }

        for(int i=fi;i<arr.length;i++){
            swap(arr,i,fi);
            permutation(arr, fi+1);
            swap(arr,i,fi);
        }            
    }

    public static void swap(char[] arr, int i, int fi){
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scan.next();
        permutation(str.toCharArray(), 0);

    }   
}

// import java.util.*;

// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(nums, 0, result);
//         return result;
//     }

//     private void backtrack(int[] nums, int fi, List<List<Integer>> result) {
//         if (fi == nums.length) {
//             List<Integer> permutation = new ArrayList<>();
//             for (int num : nums) {
//                 permutation.add(num);
//             }
//             result.add(new ArrayList<>(permutation));
//             return;
//         }

//         for (int i = fi; i < nums.length; i++) {
//             swap(nums, i, fi);
//             backtrack(nums, fi + 1, result);
//             swap(nums, i, fi); // backtrack
//         }
//     }

//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }
