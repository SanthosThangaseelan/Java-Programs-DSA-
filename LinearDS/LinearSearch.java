

public class LinearSearch{
    public static int linearSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i+1;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {5,45,49,0,421};
        System.out.println(linearSearch(arr, 55));
    }
}